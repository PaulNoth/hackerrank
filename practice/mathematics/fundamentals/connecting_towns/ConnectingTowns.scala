import scala.io.Source

object ConnectingTowns extends App {
  val lines = Source.stdin.getLines().drop(1)
  val routesArray = lines.toList.filter(_.contains(" "))
  val routes = routesArray.map(_.split(" ").map(_.toLong).foldLeft(1L)(_ * _ % 1234567))
  println(routes.mkString("\n"))
}
