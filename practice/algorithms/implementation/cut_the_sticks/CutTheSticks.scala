import scala.io.Source

object CutTheSticks extends App {
  var sticks = Source.stdin.getLines().toList.tail.head.split(" ").map(_.toInt)
  while (!sticks.isEmpty) {
    println(sticks.length)
    val sortedSticks = sticks.sorted
    val min = sortedSticks(0)
    sticks = sortedSticks.filter(_ > min)
  }
}