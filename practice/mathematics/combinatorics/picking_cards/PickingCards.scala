import scala.io.Source

object PickingCards extends App {
  val lines = Source.stdin.getLines()
  val cards = lines.drop(1).filter(_.contains(" "))
  cards.foreach(line => {
    println(pickingCombinations(line))
  })

  def pickingCombinations(s: String): Long = {
    val arr = s.split(" ").map(_.toLong).sorted
    val arrLength = arr.length
    picks(arr, arrLength, 1)
  }

  def picks(list: Array[Long], l: Int, combinations: Long): Long = {
    if(l == 0) {
      return combinations
    }
    val diff = l - list(l - 1)
    val normalizedDiff = if (diff > 0) diff else 0
    val newCombinations = (combinations * normalizedDiff) % 1000000007
    picks(list, l - 1, newCombinations)
  }
}
