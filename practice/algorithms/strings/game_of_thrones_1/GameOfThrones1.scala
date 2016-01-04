import scala.io.Source

object GameOfThrones1 extends App {
  val line = Source.stdin.bufferedReader().readLine()
  validate(line)

  def isPalindrome(length: Int, charMap: Map[Char, String]): Boolean = {
    if(length % 2 == 0)
      charMap.forall(entry => entry._2.length % 2 == 0)
    else
      charMap.count(entry => entry._2.length % 2 == 1) == 1
  }

  def validate(line: String): Unit = {
    val charMap = line.groupBy(c => c)
    println(if(isPalindrome(line.length, charMap)) "YES" else "NO")
  }
}