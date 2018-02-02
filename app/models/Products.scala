package models

import play.api.data.Form
import play.api.data.Forms._
import scala.collection.mutable.ArrayBuffer

case class Product(product: String)

object Product {

  val createProductForm = Form(
    mapping(
      "product" -> nonEmptyText

    )(Product.apply)(Product.unapply)
  )

  val productsList =  ArrayBuffer(
    Product("../../images/optimum-nutrition-100-whey-4kg-421-p.png"),
    Product("../../images/usn_-muscle_fuel_anabolic_-_4kg.png"),
    Product("../../images/OSX-2_03kg.png"),
    Product("../../images/ON_Creatine.jpg"),
    Product("../../images/NutriTechfit-Creatine-Monohydrate-1.png"),
    Product("../../images/myprotein_creatine.jpg")

  )
}
