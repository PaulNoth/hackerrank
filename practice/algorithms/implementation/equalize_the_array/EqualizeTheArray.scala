import scala.io.Source

object EqualizeTheArray extends App {
  val lines = Source.stdin.getLines().toList
  val array = lines(1).split(" ").map(_.toInt)

  val maxOccuredNumber = array.groupBy(n => n).map(_._2.length).max
  val toRemove = array.length - maxOccuredNumber
  println(toRemove)
}