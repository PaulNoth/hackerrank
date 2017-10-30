import scala.io.Source

object Solution extends App {
  val lines = Source.stdin.getLines().toList
  val (s, n, m) = lines.head.split(" ").map(_.toInt).toList match {
    case a :: b :: c :: Nil => (a, b, c)
  }
  val keyboards = lines(1).split(" ").map(_.toInt)
  val usbs = lines(2).split(" ").map(_.toInt)

  val allSmallerThanS = (for {
    i <- 0 until n
    j <- 0 until m
  } yield (i, j)).toList.filter {
    a => keyboards(a._1) + usbs(a._2) <= s
  }

  val sum = if(allSmallerThanS.isEmpty) {
    -1
  } else {
    val indexes = allSmallerThanS.maxBy {
      a => keyboards(a._1) + usbs(a._2)
    }
    keyboards(indexes._1) + usbs(indexes._2)
  }
  println(sum)
}