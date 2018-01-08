import scala.io.Source

object Solution extends App {
  val lines = Source.stdin.getLines().toList
  val string1 = lines.head
  val string2 = lines.tail.head

  val commonChars = string1.intersect(string2)

  val toRemove = (string1.length - commonChars.length) + (string2.length - commonChars.length)

  println(toRemove)
}