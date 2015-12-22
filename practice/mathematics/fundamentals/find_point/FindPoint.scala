import scala.io.Source

case class Point(val x: Int, val y: Int) {
  def reflection(midPoint: Point): Point = {
    val rx = 2 * midPoint.x - x
    val ry = 2 * midPoint.y - y
    Point(rx, ry)
  }
}

object FindPoint extends App {
  val coordinates = Source.stdin.getLines().drop(1)
  coordinates.foreach {
    lines => {
      val ints = lines.split(" ").map(_.toInt)
      val point = Point(ints(0), ints(1))
      val midPoint = Point(ints(2), ints(3))
      val symmetricPoint = point.reflection(midPoint)
      println(s"${symmetricPoint.x} ${symmetricPoint.y}")
    }
  }
}
