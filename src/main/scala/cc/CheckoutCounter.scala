package cc

import spire.implicits._
import spire.math._
import spire.random._

trait CheckoutCounter {
  def newTrade(): Unit
  def total(): Price
  def consume(p: Product): Unit
}

object CheckoutCounter {

  def apply(): CheckoutCounter = new CheckoutCounter {
    var state: Price = 0
    override def consume(p: Product): Unit = {state = state + p.price}
    override def total(): Price = state
    override def newTrade(): Unit = {state = 0}
  }
}

case class Product(name: String, price: Price)

object Product {
  lazy val apple: Product = Product("apple", r".60")
  lazy val orange: Product = Product("orange", r".25")
}