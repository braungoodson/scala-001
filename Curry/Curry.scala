object Curry {
  def main(args: Array[String]) = {
    println(curry(10)(3))
  }
  def curry(a: Int): (Int) => (Int) = {
    (b: Int) => (a).+(b)
  }
}
