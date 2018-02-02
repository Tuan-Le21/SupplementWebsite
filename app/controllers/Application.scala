package controllers


import models.Product

import play.api.mvc._



class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Welcome young padawan"))
  }

  def homepage = Action {
    Ok(views.html.homepage("Supplement Gorillaz"))

  }

  def products = Action {
    Ok(views.html.products("Supplement Gorillaz"))
  }

  def login = Action {
    Ok(views.html.login("Supplement Gorillaz"))
  }

  def checkout = Action {
    Ok(views.html.checkout("Supplement Gorillaz"))
  }




}


