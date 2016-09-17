import scala.io.Source

object GearsOfWar extends App {
  val lines = Source.stdin.getLines().toList
  val queries = lines.tail.map(_.toInt)

  val rotate = queries.map(q => if(q % 2 == 0) "Yes" else "No")
  println(rotate.mkString("\n"))
}