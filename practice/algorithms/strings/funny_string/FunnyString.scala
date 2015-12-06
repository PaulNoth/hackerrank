import scala.io.Source

object FunnyString extends App {
  val lines = Source.stdin.getLines().drop(1)
  val funnies = lines.map(funny).map(toText)
  println(funnies.mkString("\n"))

  def funny(s: String): Boolean = {
    val l = s.length
    s.indices.take(l - 1).forall(i =>
      (s.charAt(i) - s.charAt(i + 1)).abs == (s.charAt(l - i - 2) - s.charAt(l - i - 1)).abs)
  }

  def toText(b: Boolean): String = {
    if(b) "Funny" else "Not Funny"
  }
}