import scala.io.Source

object Solution extends App {
  val lines = Source.stdin.getLines().toList
  val bars = lines(1).split(" ").map(_.toInt).toList
  val dm = lines(2).split(" ").map(_.toInt).toList match {
    case i :: j :: Nil => (i, j)
  }

  val allConsecutives = bars.sliding(dm._2)
  val result = allConsecutives.count(bars => bars.sum == dm._1)

  println(result)
}