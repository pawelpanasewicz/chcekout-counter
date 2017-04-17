package howitworks

import cc.Spec

class HelloSquants extends Spec {

  "money in squants" in {

    import squants.market._

    val tenPounds = GBP.apply(10)
    val elevenPounds = tenPounds + GBP(1)

    elevenPounds mustBe GBP(11)

    the [NoSuchExchangeRateException] thrownBy (tenPounds + USD(10)) withClue "adding different currencies throws exception"
    //ehhh, not type safe.
  }

}
