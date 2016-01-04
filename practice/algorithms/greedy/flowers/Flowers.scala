import scala.io.Source

object Flowers extends App {
  val lines = Source.stdin.getLines().toList
  val definition = lines(0).split(" ").map(_.toInt)
  val n = definition(0)
  val k = definition(1)
  val prices = lines(1).split(" ").map(_.toInt)
  val descendingPrices = prices.sortWith((i, j) => i > j)
  val total = descendingPrices.indices.map(totalPrice).sum
  println(total)

  def totalPrice(index: Int): Int = {
    val factor = index / k
    (factor + 1) * descendingPrices(index)
  }
}