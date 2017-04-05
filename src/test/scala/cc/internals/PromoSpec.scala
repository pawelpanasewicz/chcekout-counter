package cc
package internals

import Product._
import spire.implicits._

class PromoSpec extends Spec {

  "buy one, get one free on Apples" in {
    Promo.discount(Map[Product, Count](apple -> 2, orange -> 0)) mustBe apple.price withClue "one apple for free"
    Promo.discount(Map[Product, Count](apple -> 1, orange -> 1)) mustBe apple.price withClue "one apple for free - even if second fruit is orange"
    Promo.discount(Map[Product, Count](apple -> 2, orange -> 5)) mustBe (apple.price * 2) withClue "two apples for free"
    Promo.discount(Map[Product, Count](apple -> 10, orange -> 5)) mustBe (apple.price * 7) withClue "only one apple for free (two apples)"
    Promo.discount(Map[Product, Count](apple -> 10, orange -> 0)) mustBe (apple.price * 5) withClue "half of apples for free"
    Promo.discount(Map[Product, Count](apple -> 11, orange -> 0)) mustBe (apple.price * 5) withClue "half of apples for free - even if there is odd number of them"
    Promo.discount(Map[Product, Count](apple -> 0, orange -> 1)) mustBe 0 withClue "no apples at all"
  }

}