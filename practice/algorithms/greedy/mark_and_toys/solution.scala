import scala.io.Source

object Solution extends App {
  val lines = Source.stdin.getLines().toList
  val (n, k) = lines.head.split(" ").map(_.toInt).toList match {
    case a :: b :: Nil => (a, b)
  }
  val prices = lines.tail.head.split(" ").map(_.toInt).toList.sorted

  var sum = 0
  val toys = prices.takeWhile(p => {
    sum += p
    p <= sum
  })

  println(toys.length)
}