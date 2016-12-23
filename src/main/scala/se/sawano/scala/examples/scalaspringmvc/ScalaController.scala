package se.sawano.scala.examples.scalaspringmvc

import org.springframework.stereotype.Controller
import java.text.SimpleDateFormat
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation._
import org.slf4j.LoggerFactory
import java.util.Date
import javax.validation.Valid

/**
 * Pure Scala controller.
 *
 * @author Daniel Sawano
 */
@RequestMapping(Array("/scala"))
@Controller
class ScalaController {

  private val logger = LoggerFactory.getLogger(classOf[ScalaController])

  @RequestMapping(Array("/ping"))
  @ResponseBody
  def ping(): String = {
    "pong";
  }

  @RequestMapping(Array("/echo"))
  @ResponseBody
  def echo(name: String): ScalaEcho = {
    ScalaEcho(name, weekDay())
  }

  protected def weekDay(): String = {
    new SimpleDateFormat("E").format(new Date())
  }

  @RequestMapping(value = Array("/indata"), method = Array(RequestMethod.POST))
  @ResponseStatus(HttpStatus.OK) def receiveData(@RequestBody @Valid inData: ScalaIndata): Unit = {
    logger.debug("Got valid POSTed data: {}", inData)
  }

  @RequestMapping(value = Array("/indataannotated"), method = Array(RequestMethod.POST))
  @ResponseStatus(HttpStatus.OK) def receiveDataAnnotated(@RequestBody @Valid inData: ScalaIndataAnnotated): Unit = {
    logger.debug("Got valid POSTed data: {}", inData)
  }

}
