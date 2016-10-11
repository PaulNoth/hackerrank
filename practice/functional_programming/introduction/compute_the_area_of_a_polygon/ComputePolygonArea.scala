import scala.io.Source

object ComputePolygonArea extends App {
  val lines = Source.stdin.getLines().toList
  val n = lines.head.toInt
  val pairs = lines.tail.map(_.split(" ").map(_.toInt)).map(array => Tuple2(array(0), array(1)))
  println(area(pairs))

  def area(points: List[(Int, Int)]) = {
    val n = points.length
    (0 until n).map(i => determinant(pairs(i % n), pairs((i + 1) % n))).sum / 2.0
  }

  def determinant(p1: (Int, Int), p2: (Int, Int)) = {
    p1._1 * p2._2 - p1._2 * p2._1
  }
}