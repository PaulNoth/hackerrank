object HelloWorldNTimes extends App {
  def f2(i: Int): Unit = println("Hello World")

  def f(n: Int) = (1 to n).foreach(f2(_))

  var n = readInt
  f(n)
}