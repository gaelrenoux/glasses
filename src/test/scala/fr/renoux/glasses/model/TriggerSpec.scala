package fr.renoux.glasses.model

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by gael on 21/02/17.
  */
class TriggerSpec extends FlatSpec with Matchers {


  "The action function" should "be evaluated each time" in {
    var i = 0
    val trigger = Trigger(name = "test") {
      i += 1
    }

    trigger.action()
    trigger.action()
    trigger.action()
    i should be(3)
  }

}
