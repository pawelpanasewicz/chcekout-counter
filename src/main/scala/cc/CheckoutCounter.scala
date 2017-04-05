package cc

import spire.implicits._
import spire.math._
import spire.random._

trait CheckoutCounter {
  def total(): Price
  def consume(p: Product): Unit
}

object CheckoutCounter {

  def apply(): CheckoutCounter = new CheckoutCounter {
    var state: Price = 0
    override def consume(p: Product): Unit = {state = state + p.price}
    override def total(): Price = state
  }
}

case class Product(name: String, price: Price)

object Product {
  lazy val apple: Product = Product("apple", r"60/100")
  lazy val orange: Product = Product("orange", r"25/100")
}