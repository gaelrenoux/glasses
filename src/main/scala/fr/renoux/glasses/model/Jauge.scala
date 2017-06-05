package fr.renoux.glasses.model

/**
  * Created by gael on 21/02/17.
  */
class Jauge(
             val name: String,
             val color: Option[Color],
             val minValue: Long,
             val maxValue: Long,
             val valueProducer: () => Long
           ) extends Element {

  def value = valueProducer()

}

object Jauge {
  def apply(
             name: String,
             color: Option[Color] = None,
             minValue: Long = 0,
             maxValue: Long = 100
           )(valueProducer: => Long) = {
    new Jauge(name, color, minValue, maxValue, () => valueProducer)
  }
}


