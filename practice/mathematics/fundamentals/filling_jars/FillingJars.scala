import scala.io.Source

object Solution extends App {
  val lines = Source.stdin.getLines().toList
  val jars = lines.head.split(" ").map(_.toInt).toList(0)
  val operations = lines.head.split(" ").map(_.toInt).toList(1)
  val description = lines.tail
  var sum = 0L
  description.foreach {
    line => {
      val ints = line.split(" ").map(_.toLong)
      val a = ints(0)
      val b = ints(1)
      val candies = ints(2)
      sum += ((b - a + 1) * candies)
    }
  }
  val avg = sum / jars
  println(avg)
}