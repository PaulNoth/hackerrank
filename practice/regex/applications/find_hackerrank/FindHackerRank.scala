import scala.io.Source

object FindHackerRank extends App {
  val lines = Source.stdin.getLines().drop(1)
  val outputNums = lines.map(findHackerrank)
  println(outputNums.mkString("\n"))

  def findHackerrank(line: String): Int = {
    if(line.matches("^hackerrank$") || line.matches("^hackerrank.*hackerrank$"))
      0
    else if(line.matches("^hackerrank.*"))
      1
    else if(line.matches(".*hackerrank$"))
      2
    else
      -1
  }
}
