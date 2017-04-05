package cc

import spire.implicits._
import spire.math._
import spire.random._

class SellingSpec extends Spec {

  "Selling goods - happy path" in {
    import Product._
    val checkoutCounter = CheckoutCounter()
    checkoutCounter.newTrade()
    checkoutCounter.total() mustBe 0 withClue "Initially total is 0"
    checkoutCounter.consume(apple)
    checkoutCounter.consume(orange)
    checkoutCounter.consume(apple)
    checkoutCounter.consume(apple)
    checkoutCounter.total() mustBe r"2.05" withClue "Apple cost is .60GPB and orange cost is .25GPB"

    checkoutCounter.newTrade()
    checkoutCounter.total() mustBe 0 withClue "Initially total is 0"
    checkoutCounter.consume(apple)
    checkoutCounter.consume(orange)
    checkoutCounter.consume(orange)
    checkoutCounter.total() mustBe r"1.1" withClue "Second trade"

  }

}


