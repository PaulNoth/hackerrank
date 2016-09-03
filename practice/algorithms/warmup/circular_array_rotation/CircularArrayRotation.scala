import scala.io.Source

object CircularArrayRotation extends App {
  val lines = Source.stdin.getLines().toList
  val line1 = lines.head.split(" ").map(_.toInt)
  val (n, k, q): (Int, Int, Int) = line1 match {
    case (List(a, b, c)) => (a, b, c)
    case Nil => throw new IllegalArgumentException
  }
  val elements = lines.tail.head.split(" ").map(_.toInt)
  val ms = lines.tail.tail.map(_.toInt)
  val rotationPos = k % n
  val parts = elements.splitAt(elements.length - rotationPos)
  val newElements = parts._2.toList ::: parts._1.toList
  ms.foreach(m => {
    println(newElements(m))
  })
}