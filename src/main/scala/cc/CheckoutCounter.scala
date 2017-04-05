package cc

trait CheckoutCounter {
  def total(): Double
  def consume(p: Product): Unit
}

object CheckoutCounter {
  def apply(): CheckoutCounter = new CheckoutCounter {
    var state: Double = 0
    override def consume(p: Product): Unit = {state = state + p.price}
    override def total(): Double = state
  }
}

case class Product(name: String, price: Double)

object Product {
  lazy val apple: Product = Product("apple", .60)
  lazy val orange: Product = Product("orange", .25)
}