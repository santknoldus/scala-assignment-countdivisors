# Count Divisors

**Problem:**
You have been given 3 integers: A, B and C. Find how many numbers
between A and B (both inclusive) are divisible by C. You do not need to
print these numbers, you just have to find their count.

**Code:**
```
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

```
**Output:**

![Screenshot from 2023-03-07 18-59-10](https://user-images.githubusercontent.com/125345690/223526462-968ba924-dd99-4219-a825-02a8dc97de31.png)
