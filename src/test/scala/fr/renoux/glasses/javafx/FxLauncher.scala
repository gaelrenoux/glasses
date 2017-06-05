package fr.renoux.glasses.javafx

import fr.renoux.glasses.model.{Grid, Style}

/**
  * Created by gael on 21/02/17.
  */
object FxLauncher extends App {

  Gui.launch(Grid(), Style("This is Sparta", width = 200, height = 50))

}
