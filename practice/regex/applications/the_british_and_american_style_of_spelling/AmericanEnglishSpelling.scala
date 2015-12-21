import scala.io.Source

object AmericanEnglishSpelling extends App {
  val lines = Source.stdin.getLines().toList
  val n = lines(0).toInt
  val words = lines.slice(1, n + 1).map(_.split(" ")).flatten
  val tests = lines(n + 1).toInt
  val testWords = lines.drop(n + 2)
  val counts = testWords.map(w => words.count(isUsOrUkSpelling(_, w)))
  println(counts.mkString("\n"))

  def isUsOrUkSpelling(word: String, matching: String): Boolean = {
    word.matches(matching) || word.matches(matching.replaceAll("ze", "se"))
  }
}
