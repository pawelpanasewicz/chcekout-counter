package cc

import spire.implicits._
import spire.math._
import spire.random._

class SellingSpec extends Spec {

  "Selling goods" in {
    import Product._
    CheckoutCounter.computeCost(apple) mustBe r".60" withClue "Apple cost is .60GPB"
    CheckoutCounter.computeCost(orange) mustBe r".25" withClue "Orange cost is .25GPB"
    CheckoutCounter.computeCost(apple, orange, apple, apple) mustBe r"2.05" withClue "Cost of many items simply sums up"
    CheckoutCounter.computeCost(apple, orange, orange) mustBe r"1.10" withClue "Cost of many items simply sums up"
  }

}


