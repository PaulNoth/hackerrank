import scala.io.Source

object StringMingling extends App {
  val lines = Source.stdin.getLines().toList
  val p = lines.head
  val q = lines.tail.head

  val mingled = p.indices.map(i => p(i) + "" + q(i)).mkString("")
  println(mingled)
}