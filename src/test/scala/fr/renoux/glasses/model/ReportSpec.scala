package fr.renoux.glasses.model

import scala.util.Random

/**
  * Created by gael on 21/02/17.
  */
class ReportSpec {

  /* Ecriture voulue
   *
    *
    * Report (name="myReport") {
    *   Element {
    *     name = "stuff",
    *     image = ???,
    *     items = Seq
    *   },
    *   Element {
    *     ...
    *   },
    * }
    *
    *
    * */

  def longProducer(): Long = 0L

  val test = longProducer _


  Report(name = "myReport")(
    Block(
      name = "stuff",
      elements = Seq(
        Jauge(name = "life", minValue = 0, maxValue = 100) {
          Random.nextInt(100)
        }
      )
    ),
    Block(
      name = "stuff",
      elements = Seq()
    )
  )
}
