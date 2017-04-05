package cc

import spire.implicits._
import spire.math._
import spire.random._

object CheckoutCounter {
  def computeCost(product: Product, products: Product*): Price = products.foldLeft(product.price)(_ + _.price)
}

case class Product(name: String, price: Price)

object Product {
  lazy val apple: Product = Product("apple", r".60")
  lazy val orange: Product = Product("orange", r".25")
}