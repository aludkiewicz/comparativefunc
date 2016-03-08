object Factorials {
  def main(args: Array[String]): Unit = {
    println(factRec(100000));     // StackOverflow
    println(factorial(100000));   // StackOverflow
    println(factTailRec(100000)); // Tail call optimization kicks in!
  }

  def factIter(n: Int): Int = {
    var i = n
    var a = 1
    while (i > 0) {
      a = a * i
      i -= 1
    }
    return a
  }
  
  def factorial(n: Int): Int = n match {
    case 0 => 1
    case _ => n * factorial(n-1)
}

  def factRec(n: BigInt): BigInt = {
    if (n <= 0) {
      return 1
    } else {
      return n * factRec(n - 1)
    }
  }

  def factTailRec(i: BigInt): BigInt = {
    def f(i: BigInt, accumulator: BigInt): BigInt = {
      if (i == 0) {
        return accumulator
      } else {
        return f(i - 1, i * accumulator)
      }
    }
    return f(i, 1)
  }
}
