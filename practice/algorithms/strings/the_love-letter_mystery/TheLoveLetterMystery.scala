import scala.io.Source

object TheLoveLetterMystery extends App {
  val lines = Source.stdin.getLines().drop(1)
  val diffs = lines.map(changes)
  println(diffs.mkString("\n"))

  def changes(s: String): Int = {
    val halves = s.splitAt(s.length / 2)
    val reverted2 = halves._2.reverse
    halves._1.indices.map(i => ordinalDiff(halves._1.charAt(i), reverted2.charAt(i))).sum
  }

  def ordinalDiff(ch1: Char, ch2: Char): Int = {
    (ch2 - ch1).abs
  }
}
