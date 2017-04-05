package cc

class SellingSpec extends Spec {

  "Selling goods - happy path" in {
    import Product._
    val checkoutCounter = CheckoutCounter()
    checkoutCounter.consume(apple)
    checkoutCounter.consume(orange)
    checkoutCounter.consume(apple)
    checkoutCounter.consume(apple)
    checkoutCounter.total() mustBe .60 + .25 + .60 + .60 withClue "Apple cost is .60GPB and orange cost is .25GPB"
  }
}


