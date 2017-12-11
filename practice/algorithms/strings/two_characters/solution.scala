import scala.io.Source

object Solution extends App {
  val lines = Source.stdin.getLines().toList
  val s = lines.tail.head
  val characters = s.distinct
  val strings = (for {
    i <- 0 until characters.length - 1
    j <- i + 1 until characters.length
  } yield {
    val c1 = characters(i)
    val c2 = characters(j)
    val subset = s.replaceAll("[^" + c1 + "" + c2 + "]", "")
    subset
  }).filter(isAlternating)

  val maxLength = if(strings.isEmpty) 0 else strings.maxBy(_.length).length

  println(maxLength)

  def isAlternating(s: String): Boolean = s.sliding(2).forall(ss => ss(0) != ss(1))
}