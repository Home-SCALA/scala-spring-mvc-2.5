
Example code accompanying the blog posts:
----------------------------------------
http://software.sawano.se/2012/04/scala-spring-mvc-true.html
http://software.sawano.se/2012/04/scala-spring-mvc-true-part-2.html
http://software.sawano.se/2012/05/scala-spring-mvc-true-part-3.html


* jdk-1.7.0
* mvn-2.2.1
* Spring-3.x.x
* **Java** REST-Controller | **Scala** REST-Controller
* [4 steps to add Scala to your Maven Java projects](http://stuq.nl/weblog/2008-11-26/4-steps-to-add-scala-to-your-maven-java-projects)
  | [>>](http://theyougen.blogspot.com/2010/01/how-to-setup-maven-scala-project-with.html)
  | [>>](http://www.janosgyerik.com/adding-a-scala-maven-module-inside-an-otherwise-java-maven-project/)
* Scala-2.9.1
* Specs-2.9.1 | 1.8.1
* **dependency** >> **org.scala-lang** >> **scala-compiler**
* **plugin** >> **org.apache.maven.plugins** >> **maven-compiler-plugin**
* **plugin** >> **org.scala-tools** >> **maven-scala-plugin** >> version: **2.9.1**
* **repository** >> http://scala-tools.org/repo-releases || **pluginRepository** >> http://scala-tools.org/repo-releases
* Jetty ( http://localhost:9090/scala-spring-mvc-2.5/ )


-----------------------------

* `Scala + Spring MVC = True?` [software.sawano.se/2012/04/scala-spring-mvc-true](http://software.sawano.se/2012/04/scala-spring-mvc-true.html)
* `Scala controller` [se.sawano.scala.examples.scalaspringmvc.ScalaController](src/main/scala/se/sawano/scala/examples/scalaspringmvc/ScalaController.scala)
* `Spec Test` [se.sawano.scala.examples.scalaspringmvc.ScalaControllerSpecTest](src/test/scala/se/sawano/scala/examples/scalaspringmvc/ScalaControllerSpecTest.scala)


  /**
   *    URL: http://localhost:8080/scala-spring-mvc/scala/ping
   * method: GET
   * @return Status: 200 OK | Text: pong
   */

  /**
   *    URL: http://localhost:8080/scala-spring-mvc/scala/echo?name=Alex
   * method: GET
   * @return Status: 200 OK | Text: { "name": "Alex", "weekDay": "ср" }
   */

  /**
   *    URL: http://localhost:8080/scala-spring-mvc/scala/indata
   * method: POST
   *   body: { "name": "Alex", "age": 23 }
   * @return Status: 200 OK || DEBUG: se.sawano.scala.examples.scalaspringmvc.ScalaController - Got valid POSTed data: ScalaIndata(Alex,23)
   */

  /**
   *    URL: http://localhost:8080/scala-spring-mvc/scala/indataannotated
   * method: POST
   *   body: { "name": "Alex", "age": 23 }
   * @return Status: 200 OK || DEBUG: se.sawano.scala.examples.scalaspringmvc.ScalaController - Got valid POSTed data: ScalaIndataAnnotated(Alex,23)
   */

=============================

  /**
   * Calling ScalaController.ping should
   * return pong
   */

  /**
   * Calling ScalController.echo should
   * return echo name and week day
   * DEBUG: se.sawano.scala.examples.scalaspringmvc.ScalaControllerSpecTest - ScalEcho was: ScalaEcho(Daniel,ср)
   */
