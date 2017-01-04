package se.sawano.scala.examples.scalaspringmvc

import reflect.BeanProperty

case class ScalaEcho(@BeanProperty val name: String, @BeanProperty val weekDay: String)
