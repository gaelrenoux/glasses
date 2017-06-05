package fr.renoux.glasses.javafx

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.{Button, Label}
import javafx.scene.layout.StackPane
import javafx.stage.Stage

import fr.renoux.glasses.model.{Content, Style}


/**
  * Created by gael on 21/02/17.
  */
class Gui extends Application {

  val content = Gui.content
  val style = Gui.style

  override def start(primaryStage: Stage): Unit = {

    println(s"Starting <${style.title}>")

    val btn = new Button("Click me")
    btn.setOnAction { e => println("clicked!") }

    new Label("")

    val frame = new StackPane()
    frame.getChildren.add(btn)

    val scene = new Scene(frame, style.width, style.height)
    primaryStage.setScene(scene)
    primaryStage.setTitle(style.title)
    primaryStage.show()

  }
}

object Gui {
  private var content: Content = _
  private var style: Style = _

  def launch(content: Content, style: Style): Unit = {
    this.content = content
    this.style = style
    Application.launch(classOf[Gui])
  }
}