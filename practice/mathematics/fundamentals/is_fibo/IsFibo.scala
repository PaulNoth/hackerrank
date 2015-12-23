import scala.io.Source

object IsFibo extends App {
  val lines = Source.stdin.getLines()
  val numbers = lines.drop(1).map(BigInt(_))
  val fibos = numbers.map(isFibo)
  println(fibos.mkString("\n"))

  def isFibo(n: BigInt): String = {
    var fib0: BigInt = 0
    var fib1: BigInt = 1
    while(fib0 <= n) {
      if (fib0 == n) return "IsFibo"
      val temp: BigInt = fib0
      fib0 = fib1
      fib1 += temp
    }
    "IsNotFibo"
  }
}
