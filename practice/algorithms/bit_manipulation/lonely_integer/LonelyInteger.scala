import scala.io.Source

object LonelyInteger extends App {
  val arr = (Source.stdin.getLines().toList)(1).split(" ").map(_.toInt)
  val groups = arr.groupBy(i => i)
  val uniqueElement = groups.keys.find(key => groups.get(key).get.size == 1)
  println(uniqueElement)
}
