import scala.io.Source

object Solution extends App {
  val lines = Source.stdin.getLines().toList
  val string = lines.head
  val queries = lines.tail.tail.map(_.toInt)

  val subs = uniformSubstrings(string)
  val substringWeights = subs.flatMap(s => {
    val c = s.charAt(0).toInt - 'a'.toInt + 1
    (1 to s.length).map(i => i * c)
  }).toSet

  queries.foreach(q => {
    val msg = if(substringWeights.contains(q)) "Yes" else "No"
    println(msg)
  })

  def uniformSubstrings(s: String): List[String] = {
    if(s.length <= 0) {
      return Nil
    }
    val c = s.charAt(0)
    val substring = s.takeWhile(_ == c)
    substring :: uniformSubstrings(s.drop(substring.length))
  }
}
