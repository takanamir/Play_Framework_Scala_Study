package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import akka.util._
import play.api.http._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index(name: Option[String], value: Option[String]) = Action { request =>
    val s_name: String = name.getOrElse("");
    val s_value: String = value.getOrElse("");
    val sessions = request.session.data
    val message = "<pre>" + sessions + "</pre>"
    val res = Ok("<title>Hello!</title><h1>Hello!</h1>" + message)
      .as(HTML)
    res.withSession(request.session + (s_name -> s_value))
  }

}