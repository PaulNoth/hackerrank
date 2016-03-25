import scala.io.Source

object ComputePolygonPerimeter extends App {
  val lines = Source.stdin.getLines().toList
  val n = lines.head.toInt
  val pairs = lines.tail.map(_.split(" ").map(_.toInt)).map(array => Tuple2(array(0), array(1)))
  println(perimeter(pairs))


  def perimeter(points: List[(Int, Int)]) = {
    val n = points.length
    (0 until n).map(i => length(pairs(i % n), pairs((i + 1) % n))).sum
  }

  def length(p1: (Int, Int), p2: (Int, Int)) = {
    Math.sqrt((Math.pow(p2._1 - p1._1, 2)) + (Math.pow(p2._2 - p1._2, 2)))
  }
}