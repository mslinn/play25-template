package controllers

import javax.inject._
import play.api._
import play.api.mvc._

/** This is a sample Scaladoc comment with links to [[scala.Option]] and [[play.api.Application]].
  * Run `sbt doc` or `activator doc` and ScalaDoc will be generated with the root at `target/scala-2.1x/api/index.html`.
  * Browse to `ApplicationController` to see this ScalaDoc */
@Singleton
class ApplicationController @Inject()(implicit webJarAssets: WebJarAssets) extends Controller {
  val Logger = org.slf4j.LoggerFactory.getLogger("application")

  def help = Action { implicit request =>
    Ok(views.html.play20.welcome("Play Help"))
  }

  def hello(name: String) = Action { implicit request =>
    Ok(views.html.hello(if (name.isEmpty) "Everybody" else name))
  }
}
