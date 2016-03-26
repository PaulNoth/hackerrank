import scala.io.Source

object ConcavePolygon extends App {
  val lines = Source.stdin.getLines().toList
  val pairs = lines.tail.map(_.split(" ").map(_.toInt)).map(array => Tuple2(array(0), array(1)))
  val threes = pairs.combinations(3)
  //println(if(threes.forall(isConcave)) "YES" else "NO")
  println(if(isConcave2(pairs)) "YES" else "NO")

  def isConcave(points: List[(Int, Int)]): Boolean = {
    val n = points.length
    (0 until n).forall(i => {
      val a = angle(points(i % n), points((i + 1) % n), points((i + 2) % n))
      a >= Math.PI / 2
    })
  }

  def almostEquals(val1: Double, val2: Double): Boolean = {
    (val1 - val2).abs > 0.01
  }

  def isConcave2(points: List[(Int, Int)]): Boolean = {
    val n = points.length
    (0 until n).forall(i => {
      val a = angle2(points(i % n), points((i + 1) % n), points((i + 2) % n))
      a >= Math.PI / 2
      java.lang.Double.compare(a, Math.PI / 2) > 0
    })
  }

  def angle2(p1: (Int, Int), p2: (Int, Int), p3: (Int, Int)): Double = {
    val tan = Math.atan2(p1._2 - p2._2, p1._1 - p2._1) - Math.atan2(p3._2 - p2._2, p3._1 - p2._1)
    tan
  }

  def angle(p1: (Int, Int), p2: (Int, Int), p3: (Int, Int)): Double = {
    val a = length(p1, p2)
    val b = length(p2, p3)
    val c = length(p1, p3)
    val cos = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b))
    cos
  }

  def length(p1: (Int, Int), p2: (Int, Int)) = {
    Math.sqrt((Math.pow(p2._1 - p1._1, 2)) + (Math.pow(p2._2 - p1._2, 2)))
  }
}