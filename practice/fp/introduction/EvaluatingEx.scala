object EvaluatingEx extends App {
  def f(x: Double): Double =
    {
      f2(x, 9)
    }

  def fact(x: Int): Int = if (x <= 1) 1 else x * fact(x - 1)

  def f2(x: Double, i: Int): Double =
    {
      if (i == 0) 1 else Math.pow(x, i) / fact(i) + f2(x, i - 1)
    }

  val n = readInt
  (1 to n) foreach (x => println(f(readFloat())))
}