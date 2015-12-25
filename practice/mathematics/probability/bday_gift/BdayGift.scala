import scala.io.Source

object BdayGift extends App {
  val lines = Source.stdin.getLines().drop(1).map(_.toLong)
  printf("%.1lf", lines.sum.toDouble / 2)
}
