import scala.io.Source

object FlippingBits extends App {
  private[this] val MAX = java.lang.Long.parseLong("11111111111111111111111111111111", 2)

  val numbers = Source.stdin.getLines().drop(1).map(_.toLong)
  val flipped = numbers.map(_ ^ MAX)
  println(flipped.mkString("\n"))
}
