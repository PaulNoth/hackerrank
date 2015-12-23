import scala.io.Source

object MinimumDraws extends App {
  val lines = Source.stdin.getLines()
  val pairs = lines.drop(1).map(_.toInt)
  val draws = pairs.map(_ + 1)
  println(draws.mkString("\n"))
}
