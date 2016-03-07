/**
 * Creating a function that increments from a given (closed-over) starting value, using a closure
 * Note that the major difference from the same snippet in Javascript and Python comes from Scala
 * being statically typed. Javascript and Python are dynamically typed, so they don't need all of
 * the type information Scala does.
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
