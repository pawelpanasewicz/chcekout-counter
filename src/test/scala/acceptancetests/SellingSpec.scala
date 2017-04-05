package acceptancetests

import cc.{CheckoutCounter, Product, Spec}
import spire.implicits._

class SellingSpec extends Spec {

  "Selling goods" in {
    import Product._
    CheckoutCounter.computeCost(apple) mustBe r".60" withClue "Apple cost is .60GPB"
    CheckoutCounter.computeCost(orange) mustBe r".25" withClue "Orange cost is .25GPB"
    CheckoutCounter.computeCost(apple, orange, apple, apple) mustBe r"0.85" withClue "After applying promo1 two apples go for free. Rest of items simply sums up"
    CheckoutCounter.computeCost(apple, orange, orange) mustBe r"0.5" withClue "In such transaction only one apple goes for free. Rest of items sums up"
  }

}


