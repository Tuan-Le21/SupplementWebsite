package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Welcome young padawan"))
  }

  def homepage = Action {
    Ok(views.html.homepage("Supplement Gorillaz", "Welcome to Supplement Gorillaz"))

  }


}
