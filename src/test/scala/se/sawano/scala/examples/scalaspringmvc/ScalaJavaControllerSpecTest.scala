package se.sawano.scala.examples.scalaspringmvc

import org.specs2.mutable.Specification
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ScalaJavaControllerSpecTest extends Specification {

  "Calling ScalaJavaController.ping" should {
    "return pong" in {
      new ScalaJavaController().ping() must be equalTo "pong"
    }
  }

}
