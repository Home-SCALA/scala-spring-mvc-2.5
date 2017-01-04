package se.sawano.scala.examples.scalaspringmvc

import reflect.BeanProperty

/**
 * If we are using the Jackson Scala module we can remove the @BeanProperty annotations.
 */
case class ScalaEcho(@BeanProperty val name: String, @BeanProperty val weekDay: String)
