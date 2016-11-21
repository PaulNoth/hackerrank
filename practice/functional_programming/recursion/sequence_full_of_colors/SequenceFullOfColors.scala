import scala.io.Source
import scala.collection.mutable.Map

object SequenceFullOfColors extends App {
  val lines = Source.stdin.getLines().toList.tail
  val results = lines.map(fullOfColors).map(_.toString.capitalize)

  println(results.mkString("\n"))

  def fullOfColors(sequence: String): Boolean = {
    val colors = Map.empty[Char, Int]
    def prefixSequences(seq: String, n: Int): Boolean = {
      val char = seq(n)
      val count = colors.getOrElse(char, 0)
      colors.put(char, count + 1)
      if(n < seq.length - 1) {
        val greenCount = colors.getOrElse('G', 0)
        val redCount = colors.getOrElse('R', 0)
        val yellowCount = colors.getOrElse('Y', 0)
        val blueCount = colors.getOrElse('B', 0)
        if((greenCount - redCount).abs <= 1 && (yellowCount - blueCount).abs <= 1) {
          return prefixSequences(seq, n + 1)
        }
        return false
      }
      true
    }

    val condition = prefixSequences(sequence, 0)
    val greenCount = colors.getOrElse('G', 0)
    val redCount = colors.getOrElse('R', 0)
    val yellowCount = colors.getOrElse('Y', 0)
    val blueCount = colors.getOrElse('B', 0)
    condition && (greenCount == redCount) && (yellowCount == blueCount)
  }
}