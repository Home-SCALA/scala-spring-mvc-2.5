package se.sawano.scala.examples.scalaspringmvc

import org.springframework.stereotype.Controller
import java.text.SimpleDateFormat
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation._
import org.slf4j.LoggerFactory
import java.util.Date
import javax.validation.Valid

/**
 * Scala controller
 * ****************
 * @see http://software.sawano.se/2012/04/scala-spring-mvc-true.html
 */
@RequestMapping(Array("/scala"))
@Controller
class ScalaController {

  private val logger = LoggerFactory.getLogger(classOf[ScalaController])

  /**
   *    URL: http://localhost:8080/scala-spring-mvc/scala/ping
   * method: GET
   * @return Status: 200 OK | Text: pong
   */
  @RequestMapping(Array("/ping"))
  @ResponseBody
  def ping(): String = {
    "pong";
  }

  /**
   *    URL: http://localhost:8080/scala-spring-mvc/scala/echo?name=Alex
   * method: GET
   * @return Status: 200 OK | Text: { "name": "Alex", "weekDay": "ср" }
   */
  @RequestMapping(Array("/echo"))
  @ResponseBody
  def echo(name: String): ScalaEcho = {
    ScalaEcho(name, weekDay())
  }

  protected def weekDay(): String = {
    new SimpleDateFormat("E").format(new Date())
  }

  /**
   *    URL: http://localhost:8080/scala-spring-mvc/scala/indata
   * method: POST
   *   body: { "name": "Alex", "age": 23 }
   * @return Status: 200 OK || DEBUG: se.sawano.scala.examples.scalaspringmvc.ScalaController - Got valid POSTed data: ScalaIndata(Alex,23)
   */
  @RequestMapping(value = Array("/indata"), method = Array(RequestMethod.POST))
  @ResponseStatus(HttpStatus.OK) def receiveData(@RequestBody @Valid inData: ScalaIndata): Unit = {
    logger.debug("Got valid POSTed data: {}", inData)
  }

  /**
   *    URL: http://localhost:8080/scala-spring-mvc/scala/indataannotated
   * method: POST
   *   body: { "name": "Alex", "age": 23 }
   * @return Status: 200 OK || DEBUG: se.sawano.scala.examples.scalaspringmvc.ScalaController - Got valid POSTed data: ScalaIndataAnnotated(Alex,23)
   */
  @RequestMapping(value = Array("/indataannotated"), method = Array(RequestMethod.POST))
  @ResponseStatus(HttpStatus.OK) def receiveDataAnnotated(@RequestBody @Valid inData: ScalaIndataAnnotated): Unit = {
    logger.debug("Got valid POSTed data: {}", inData)
  }

}
