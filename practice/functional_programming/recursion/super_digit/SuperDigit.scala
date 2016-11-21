import scala.io.Source

object SuperDigit extends App {
  val line = Source.stdin.bufferedReader().readLine()
  val nk = line.split(" ")
  val n = nk(0)
  val k = nk(1).toInt

  println(superDigit(n, k))

  def superDigit(num: String, k: Int): String = {
    if(num.length == 1) {
      return num
    } else {
      val sum: BigInt = num.foldLeft(BigInt(0))(_ + Character.digit(_, 10)) * k
      return superDigit(sum.toString, 1)
    }
  }
}