package com.knoldus.countdivisors

object CountDivisors {

  //function to count total divisors in given range
  def countDivisors(lowerLimit:Int, upperLimit:Int, divisor:Int):Int = {
    var count = 0
    for(number <- lowerLimit to upperLimit){
        if(number%divisor == 0)
          count += 1
    }
    count
  }

  def main(args :Array[String]):Unit = {
    val lowerLimit = scala.io.StdIn.readInt()
    val upperLimit = scala.io.StdIn.readInt()
    val divisor = scala.io.StdIn.readInt()

    try{
      if (upperLimit < lowerLimit) {
        throw new ArithmeticException("Invalid Input: Please enter valid input")
      }
      else {
        val count = countDivisors(lowerLimit, upperLimit, divisor)
        println(count)
      }
    } catch {
      case exception: Exception => {
        println(exception.getMessage)
      }
    }
  }
}
