import scala.io.Source

object Solution extends App {
  val inputLines = Source.stdin.getLines().toList
  val n = inputLines.head.toInt
  val elements = inputLines.tail.head.split(" ").map(_.toInt)

  val y = (1 to n).map(i => {
    val index = elements.indexOf(i)
    val value1 = index + 1
    val index2 = elements.indexOf(value1)
    index2
  })

  println(y.mkString("\n"))
}
