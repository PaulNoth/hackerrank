import scala.io.Source
import scala.util.control.Breaks._

object Solution extends App {
  val lines = Source.stdin.getLines().toList
  val elements = lines.tail.head.split(" ").map(_.toInt).sorted

  var maxDiffCount = 0
  for(i <- 0 until elements.length -1) {
    breakable {
      for (j <- i + 1 until elements.length) {
        val diff = (elements(i) - elements(j)).abs
        if (diff > 1) {
          break
        }
        val diffCount = j - i
        maxDiffCount = Array(diffCount, maxDiffCount).max
      }
    }
  }

  println(maxDiffCount + 1)
}