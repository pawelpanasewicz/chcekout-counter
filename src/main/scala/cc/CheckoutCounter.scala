package cc

import spire.implicits._
import spire.math._
import spire.algebra._
import Product._

object CheckoutCounter {

  def computeCost(product: Product, products: Product*): Price = {
    val all = product +: products
    val occurrences: Map[Product, SafeLong] = all.foldLeft(emptyMap)((acc, p) => acc.updated(p, acc(p) + 1))
    cost(occurrences)
  }

  private def cost(occurrences: Map[Product, SafeLong]): Price = occurrences.foldLeft(0: Price)((acc, kv) => acc + (kv._1.price * kv._2))
  private lazy val emptyMap = Map[Product, SafeLong]().withDefaultValue(0: SafeLong)

}

case class Product(name: String, price: Price)

object Product {
  lazy val apple: Product = Product("apple", r".60")
  lazy val orange: Product = Product("orange", r".25")
}