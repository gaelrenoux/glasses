package fr.renoux.glasses.model

/**
  * Created by gael on 21/02/17.
  */
class Grid private (val rows: Seq[Seq[Block]]) extends Content {
  val colCount = if (rows.isEmpty) 0 else rows map (_.size) max
  val rowCount = rows.size
}

object Grid {

  def apply(rows: Row*) = new Grid(rows map (_.toSeq))

  abstract class Line(elements: Block*) {
    val toSeq = elements
  }
  case class Row(elements: Block*) extends Line(elements: _*)
  case class Column(elements: Block*) extends Line(elements: _*)

}
