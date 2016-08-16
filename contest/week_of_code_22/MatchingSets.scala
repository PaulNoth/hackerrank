import scala.io.Source

object MatchingSets extends App {
  val lines = Source.stdin.getLines().toList
  val set1 = lines(1).split(" ").map(_.toLong).sorted
  val set2 = lines(2).split(" ").map(_.toLong).sorted

  val pairs = set1 zip set2
  val pairIncrements = pairs.map(increments).sum
  val pairDecrements = pairs.map(decrements).sum

  println(if(pairIncrements == pairDecrements) (pairIncrements + pairDecrements) / 2 else -1)

  def decrements(pair: (Long, Long)): Long = {
    val el1 = pair._1
    val el2 = pair._2
    if (el1 > el2) (el1 - el2).abs else 0
  }

  def increments(pair: (Long, Long)): Long = {
    val el1 = pair._1
    val el2 = pair._2
    if (el1 < el2) (el2 - el1).abs else 0
  }
}