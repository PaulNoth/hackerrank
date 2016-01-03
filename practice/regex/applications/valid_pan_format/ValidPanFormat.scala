import scala.io.Source

object ValidPanFormat extends App {

  private[this] val PAN = "[A-Z]{5}\\d{4}[A-Z]"

  val lines = Source.stdin.getLines().drop(1)
  val pans = lines.map(isPan)
  println(pans.mkString("\n"))

  def isPan(s: String): String = {
    if(s.matches(PAN)) {
      "YES"
    } else {
      "NO"
    }
  }
}