import scala.io.Source

object Solution extends App {
  val lines = Source.stdin.getLines().toList
  val catsAndMouses: List[(Int, Int, Int)] = lines.tail.map(_.split(" ").map(_.toInt).toList match {
    case a :: b :: m :: Nil => (a, b, m)
    case _ => (0, 0, 0)
  })

  catsAndMouses.foreach(cm => {
    val a = cm._1
    val b = cm._2
    val m = cm._3

    val catACatchMouseSteps = (a - m).abs
    val catBCatchMouseSteps = (b - m).abs

    val result = if(catACatchMouseSteps == catBCatchMouseSteps) {
      "Mouse C"
    } else if(catACatchMouseSteps < catBCatchMouseSteps) {
      "Cat A"
    } else {
      "Cat B"
    }

    println(result)
  })
}