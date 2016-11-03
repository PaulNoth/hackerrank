import scala.io.Source

object SockMerchant extends App {
  val lines = Source.stdin.getLines().toList
  val socks = lines(1).split(" ").map(_.toInt)
  val sockGroups = socks.groupBy(c => c)
  val sockGroupPairs = sockGroups.map(group => group._2.length / 2)
  val pairs = sockGroupPairs.sum

  println(pairs)
}