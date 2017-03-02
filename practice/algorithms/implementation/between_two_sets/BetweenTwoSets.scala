import scala.io.Source

object BetweenTwoSets extends App {
  val lines = Source.stdin.getLines().toList
  val a = lines(1).split(" ").map(_.toInt)
  val b = lines(2).split(" ").map(_.toInt)
  val allNumbers = (a.max to b.min).toList

  val x = allNumbers.filter(num => a.forall(i => num % i == 0) && b.forall(j => j % num == 0))
  println(x.size)
}