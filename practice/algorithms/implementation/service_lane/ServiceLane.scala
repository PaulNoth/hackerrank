object ServiceLane extends App {
  val lines = io.Source.stdin.getLines().toList
  val lanes = lines(1).split(" ").map(_.toInt)
  val segments = lines.drop(2)
  val vehicles = segments.map(width(lanes, _))
  println(vehicles.mkString("\n"))

  def width(lanes: Array[Int], inputLane: String): Int = {
    val arr = inputLane.split(" ").map(_.toInt)
    lanes.slice(arr(0), arr(1) + 1).min
  }
}
