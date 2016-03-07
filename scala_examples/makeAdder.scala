/**
 * Creating a function that increments from a given (closed-over) starting value, using a closure
 */

object ClosureEx extends App {
  def makeAdder(x: Int): (Int) => Int = {
    def inc(y: Int): Int = {
      x + y
    }
    inc
  }
  
  val inc5 = makeAdder(5)
  val inc10 = makeAdder(10)
  
  println(inc5(2))  // 7
  println(inc10(2)) // 12
    
}      