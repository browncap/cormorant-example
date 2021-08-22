 scalaVersion in ThisBuild := "2.13.4"

 name := "cormorant-example"

 version := "0.1"

 val catsVersion                     = "2.1.1"
 val catsEffectVersion               = "3.2.1"
 val fs2Version                      = "3.1.0"
 val cormorantVersion                = "0.5.0-M1"

 libraryDependencies ++= Seq(
   "org.typelevel"     %% "cats-core"          % catsVersion,
   "org.typelevel"     %% "cats-effect"        % catsEffectVersion,
   "io.chrisdavenport" %% "cormorant-core"     % cormorantVersion,
   "io.chrisdavenport" %% "cormorant-generic"  % cormorantVersion,
   "io.chrisdavenport" %% "cormorant-parser"   % cormorantVersion,
   "io.chrisdavenport" %% "cormorant-fs2"      % cormorantVersion,
   "io.chrisdavenport" %% "cormorant-http4s"   % cormorantVersion,
   "io.chrisdavenport" %% "cormorant-refined"  % cormorantVersion,
   "co.fs2"            %% "fs2-io"             % fs2Version,
   "co.fs2"            %% "fs2-core"           % fs2Version
 )
