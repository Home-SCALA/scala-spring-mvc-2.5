package se.sawano.scala.examples.scalaspringmvc

import java.lang.Integer
import javax.validation.constraints.{Min, NotNull}
import reflect.BeanProperty
import org.codehaus.jackson.annotate.JsonProperty
import annotation.target.beanGetter

/**
 * If we are using the Jackson Scala module we can remove the @JsonProperty annotations.
 * <p/>
 * You could also use @field instead of @beanGetter for JSR-303 to work.
 */
case class ScalaIndataAnnotated(@JsonProperty("name") @BeanProperty @(NotNull@beanGetter) val name: String,
  @JsonProperty("age") @BeanProperty @(Min@beanGetter)(1) val age: Integer)
