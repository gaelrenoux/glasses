package fr.renoux.glasses.model

/**
  * Created by gael on 21/02/17.
  */
class Report (val name : String, val blocks: Seq[Block])

object Report {
  def apply(name: String)(elements: Block*) = {
    new Report(name, elements)
  }
}