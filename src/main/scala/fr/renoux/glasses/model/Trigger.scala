package fr.renoux.glasses.model

/**
  * Created by gael on 21/02/17.
  */
class Trigger(val name: String, val action: () => Unit) extends Element {


}


object Trigger {
  def apply(
             name: String
           )(action: => Unit) = {
    new Trigger(name, () => action)
  }
}


