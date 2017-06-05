package fr.renoux.glasses.model

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by gael on 21/02/17.
  */
class JaugeSpec extends FlatSpec with Matchers {


  "The value function" should "be evaluated each time" in {
    var i = 0
    val jauge = Jauge(name = "test") {
      i  += 1
      i
    }

    jauge.value should be (1)
    jauge.value should be (2)
    jauge.value should be (3)
  }

}
