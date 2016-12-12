import scala.io.Source

object FlatlandSpaceStations extends App {
  val lines = Source.stdin.getLines().toList
  val nk = lines.head.split(" ").map(_.toInt)
  val n = nk(0)
  val spaceStations = lines(1).split(" ").map(_.toInt).sorted.toList
  val citiesInside = if(spaceStations.size > 1) spaceStations.sliding(2, 1)
    .map(item => (item(1) - item(0)).abs - 1) else Nil
  val maxDistance = ((spaceStations(0) - 0)
    :: citiesInside.map(c => (c / 2.0).ceil.toInt).toList
    ::: List((n - 1) - spaceStations.last)).max

  println(maxDistance)
}