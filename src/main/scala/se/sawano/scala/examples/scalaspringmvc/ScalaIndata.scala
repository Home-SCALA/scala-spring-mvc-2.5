package se.sawano.scala.examples.scalaspringmvc

import java.lang.Integer
import javax.validation.constraints.{NotNull, Min}

/**
 * If we are not using the Jackson Scala module we need to add the JSON annotations just as we did with
 * the immutable POJO.
 */
case class ScalaIndata(val name: String, val age: Integer) {

  @NotNull
  def getName() = name

  @Min(1)
  def getAge() = age
}
