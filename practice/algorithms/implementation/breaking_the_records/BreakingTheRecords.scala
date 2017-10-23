import scala.io.Source

object Solution extends App {
  val lines = Source.stdin.getLines().toList
  val points = lines.tail.head.split(" ").map(_.toInt)
  var mostPoints = points.head
  var leastPoints = points.head
  var mostPointsBreak = 0
  var leastPointsBreak = 0

  points.foreach(point => {
    if(point > mostPoints) {
      mostPoints = point
      mostPointsBreak += 1
    }
    if(point < leastPoints) {
      leastPoints = point
      leastPointsBreak += 1
    }
  })

  println(mostPointsBreak + " " + leastPointsBreak)
}