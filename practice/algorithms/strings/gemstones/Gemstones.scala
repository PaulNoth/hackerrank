import scala.io.Source

object Gemstones extends App {
  val strings = Source.stdin.getLines().drop(1).toList

  val first = strings(0)
  val gemstones = strings.drop(1).foldLeft(first)(_ intersect _)
  println(gemstones.size)
}
