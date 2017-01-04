package se.sawano.scala.examples.scalaspringmvc

import org.specs2.mutable.Specification
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner
import java.text.SimpleDateFormat
import java.util.Date
import org.slf4j.LoggerFactory

/**
 * ScalaController SpecTest
 * ************************
 * InvocationTargetException for 'Start' in MyNotifierRunner; cause: org/specs2/specification/TagsAssociation
 */

@RunWith(classOf[JUnitRunner])
class ScalaControllerSpecTest extends Specification {

  val logger = LoggerFactory.getLogger(getClass)

  /**
   * Calling ScalaController.ping should
   * return pong
   */
  "Calling ScalaController.ping" should {
    "return pong" in {
      new ScalaController().ping() must be equalTo "pong"
    }
  }

  /**
   * Calling ScalController.echo should
   * return echo name and week day
   * DEBUG: se.sawano.scala.examples.scalaspringmvc.ScalaControllerSpecTest - ScalEcho was: ScalaEcho(Daniel,ср)
   */
  "Calling ScalController.echo" should {
    "echo name and week day" in {
      val weekDay = new SimpleDateFormat("E").format(new Date());
      val echo: ScalaEcho = new ScalaController().echo("Daniel")
      echo.name must be equalTo "Daniel"
      echo.weekDay must be equalTo weekDay

      logger.debug("ScalEcho was: {}", echo)
      success
    }
  }

}
