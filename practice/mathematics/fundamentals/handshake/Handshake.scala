import scala.io.Source

object Handshake extends App {
  val lines = Source.stdin.getLines()
  val directors = lines.drop(1).map(_.toInt)
  val handshakes = directors.map(Range(0, _).toList.sum)
  println(handshakes.mkString("\n"))
}
