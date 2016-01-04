import scala.io.Source

object ClosestNumbers extends App {
  val lines = Source.stdin.getLines().toList
  val array = lines(1).split(" ").map(_.toInt)
  val sortedArray = array.sorted
  val pairs = sortedArray.sliding(2).toList
  val minDifference = pairs.map(arr => arr(1) - arr(0)).min
  val elements = pairs.filter(arr => arr(1) - arr(0) == minDifference).flatten.sorted
  println(elements.mkString(" "))
}