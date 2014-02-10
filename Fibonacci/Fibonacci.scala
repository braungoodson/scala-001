object Fibonacci {
  def main(args: Array[String]) = {
    println(f(0))
    println(f(1))
    println(f(2))
    println(f(3))
    println(f(4))
    println(f(5))
    println(f(6))
  }
  def f(x: Int): Int = {
    x match {
      case 0 => 0
      case 1 => 1
      case _ => (f((x).-(1))).+(f((x).-(2)))
    }
  }
}
