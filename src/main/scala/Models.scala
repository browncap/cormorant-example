package com.example

import io.chrisdavenport.cormorant._
import io.chrisdavenport.cormorant.generic.semiauto._
import io.chrisdavenport.cormorant.implicits._

case class Column1(col1: String)
object Column1 {
  implicit val lr: LabelledRead[Column1] = deriveLabelledRead
  implicit val lw: LabelledWrite[Column1] = deriveLabelledWrite
}

case class Column2(col2: String)
object Column2 {
  implicit val lr: LabelledRead[Column2] = deriveLabelledRead
  implicit val lw: LabelledWrite[Column2] = deriveLabelledWrite
}

case class Column3(col3: String)
object Column3 {
  implicit val lr: LabelledRead[Column3] = deriveLabelledRead
  implicit val lw: LabelledWrite[Column3] = deriveLabelledWrite
}

case class Column4(col4: Int)
object Column4 {
  implicit val lr: LabelledRead[Column4] = deriveLabelledRead
  implicit val lw: LabelledWrite[Column4] = deriveLabelledWrite
}

case class Column5(col5: Int)
object Column5 {
  implicit val lr: LabelledRead[Column5] = deriveLabelledRead
  implicit val lw: LabelledWrite[Column5] = deriveLabelledWrite
}

case class Column6(col6: Boolean)
object Column6 {
  implicit val lr: LabelledRead[Column6] = deriveLabelledRead
  implicit val lw: LabelledWrite[Column6] = deriveLabelledWrite
}

case class BasicRow(column1: String, column2: String, column3: String, column4: Int, column5: Int, column6: Boolean)
object BasicRow {
  implicit val lr: LabelledRead[BasicRow] = deriveLabelledRead
  implicit val lw: LabelledWrite[BasicRow] = deriveLabelledWrite
}

case class SimplifiedRow(column1: String, column2: String)
object SimplifiedRow {
  implicit val lr: LabelledRead[SimplifiedRow] = deriveLabelledRead
  implicit val lw: LabelledWrite[SimplifiedRow] = deriveLabelledWrite
}
