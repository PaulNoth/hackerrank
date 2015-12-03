import scala.io.Source

object Anagram extends App {
  val strings = Source.stdin.getLines().drop(1)

  val charsToDelete = strings.map(numOfChanges)
  println(charsToDelete.mkString("\n"))

  def numOfChanges(s: String): Int = {
    if (s.length % 2 != 0)
      -1
    else {
      val half1 = s.substring(0, s.length / 2)
      val half2 = s.substring(s.length / 2)
      half1.length - half1.intersect(half2).length
    }
  }
}
