//This program finds the product of elements of array provided by the user and prints it
package com.knoldus

import scala.io.StdIn

object FindProductOfArray extends App {
  val initialValueOfProduct: Int = 1
  val sizeOfArray = StdIn.readInt()

  println("Enter the number of elements in the array:")
  val inputOfArray = new Array[Int](sizeOfArray)
  val productOfArray = calculateProductOfArray(inputOfArray)
  println("Enter the values of the array:")
  for (index <- 0 until sizeOfArray) {
    inputOfArray(index) = StdIn.readInt()
  }

  def calculateProductOfArray(arrayValues: Array[Int]): Int = {
    var productOfArray = initialValueOfProduct
    for (indexOfArray <- arrayValues) {
      productOfArray *= indexOfArray
    }
    productOfArray
  }
  println("The product of the elements of the array is " + productOfArray)
}