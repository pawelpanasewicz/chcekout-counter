package cc

import spire.implicits._
import spire.math._
import spire.random._

class SellingSpec extends Spec {

  "Selling goods - happy path" in {
    import Product._
    val checkoutCounter = CheckoutCounter()
    checkoutCounter.consume(apple)
    checkoutCounter.consume(orange)
    checkoutCounter.consume(apple)
    checkoutCounter.consume(apple)
    checkoutCounter.total() mustBe r"205/100" withClue "Apple cost is .60GPB and orange cost is .25GPB"
  }
}


