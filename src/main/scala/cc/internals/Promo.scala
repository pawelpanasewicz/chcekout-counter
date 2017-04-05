package cc
package internals

import Product._

object Promo {

  /**
    * This computes discount for business offer "buy one, get one free on Apples". See test case in order to understand
    * how it works.
    */
  def discount1(products: Map[Product, Count]): Price = {
    val apples = products(apple)
    val oranges = products(orange)
    val totalProducts = apples + oranges
    val atMostCanBeForFree = totalProducts/2 //flor division
    if(oranges < apples) atMostCanBeForFree * apple.price else apples * apple.price
  }

}
