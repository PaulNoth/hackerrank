import scala.io.Source

object Solution extends App {
  val lines = Source.stdin.getLines().toList
  val n = lines.head.toInt
  val p = lines.tail.head.toInt

  val fromFront = p
  val fromBack = if(n % 2 == 0) {
    n + 1
  } else {
    n
  }
  val result = List(fromFront / 2, (fromBack - p) / 2).min

  println(result)
}