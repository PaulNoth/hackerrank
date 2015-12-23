import scala.io.Source

object HalloweenParty extends App {
  val lines = Source.stdin.getLines()
  val slices = lines.drop(1).map(_.toLong)
  val result = slices.map(pieces)
  println(result.mkString("\n"))

  def pieces(k: Long): Long = {
    val horizontal = k / 2
    val vertical = k - horizontal
    vertical * horizontal
  }
}
