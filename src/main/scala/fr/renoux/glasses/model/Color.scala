package fr.renoux.glasses.model

/**
  * Created by gael on 21/02/17.
  */
case class Color(code: Long)

object Color {
  def hexa(str: String) = Color(java.lang.Long.parseLong(str, 16))

  val Red = Color(0xff0000)
  val Blue= Color(0x0000ff)
  val Green = Color(0x00ff00)
  val Yellow = Color(0xffff00)
  val White = Color(0xffffff)
  val Black = Color(0x000000)
}
