import scala.io.Source

object BonAppetit extends App {
  val lines = Source.stdin.getLines().toList
  val k = lines.head.split(" ")(1).toInt
  val items = lines(1).split(" ").map(_.toInt)
  val actual = lines(2).toInt
  val charged = (items.sum - items(k)) / 2

  println(if(charged == actual) "Bon Appetit" else charged - actual)
}