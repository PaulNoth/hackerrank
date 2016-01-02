import scala.io.Source

object HackerrankTweets extends App {
  val lines = Source.stdin.getLines().drop(1)
  val matchingLines = lines.count(_.toLowerCase.matches(".*hackerrank.*"))
  println(matchingLines)
}