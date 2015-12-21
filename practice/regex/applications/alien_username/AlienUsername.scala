import scala.io.Source

object AlienUsername extends App {
  val usernames = Source.stdin.getLines().drop(1)

  println(usernames.map(validateUsername).mkString("\n"))

  def validateUsername(name: String): String = {
    if (name.matches("[_\\.]\\d+[a-zA-Z]*_?"))
      return "VALID"
    else
      return "INVALID"
  }
}
