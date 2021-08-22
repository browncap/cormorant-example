package com.example

import fs2.io.file.{Files, Path}
import fs2.Pipe
import fs2.{Stream, text, INothing}
import cats.effect.{ExitCode, IO, IOApp}

import cats.effect.IO._
import io.chrisdavenport.cormorant._
import io.chrisdavenport.cormorant.fs2._
import cats.implicits._

object CormorantExample extends IOApp {

  def simplify: Pipe[IO, BasicRow, SimplifiedRow] = s =>
    s.map(r => SimplifiedRow(r.column1, r.column2))

  def deleteAndWriteFile(path: Path): Pipe[IO, Byte, INothing] = s =>
    Stream.eval(Files[IO].deleteIfExists(path)).drain ++ s.through(Files[IO].writeAll(path))

  def readFile[F[_]]: IO[Unit] = {
    val path = Path("./input/example.csv")
    val target = Path("./output/example.csv")

    Files[IO].readAll(path)
      .through(text.utf8.decode)
      .through(readLabelled[IO, BasicRow])
      .through(simplify)
      .through(writeLabelled[IO, SimplifiedRow](Printer.default))
      .through(text.utf8.encode)
      .through(deleteAndWriteFile(target))
      .compile
      .drain

  }

  def run(args: List[String]): IO[ExitCode] =
    readFile.flatMap(_ => println("Success!")).as(ExitCode.Success)

}
