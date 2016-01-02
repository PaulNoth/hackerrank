import scala.io.Source

object FindSubstring extends App {
  val inputLines = Source.stdin.getLines().toList
  val linesLength = inputLines(0).toInt
  val lines = inputLines.slice(1, linesLength + 1)
  val substrings = inputLines.slice(linesLength + 2, inputLines.length)
  val counts = substrings.map(findSubstring(lines, _))
  println(counts.mkString("\n"))


  def findSubstring(lines: List[String], substring: String): Int = {
    lines.map(line => {
      val pattern = "\\w+" + substring + "\\w+"
      val matches = pattern.r.findAllMatchIn(line)
      matches.length
    }).sum
  }
}