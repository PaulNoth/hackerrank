import scala.io.Source

object IPAddressValidation extends App {
  private[this] val IP6_PATTERN = "([a-f0-9]{1,4}:){7}\\b[0-9a-f]{1,4}\\b"
  private[this] val IP4_PATTERN =
    "\\b(((2[0-5][0-5])|(1[0-9][0-9])|(\\b[1-9][0-9]\\b)|(\\b\\d\\b))\\.){3}((2[0-5][0-5])|(1[0-9][0-9])|(\\b[1-9][0-9]\\b)|(\\b\\d\\b))\\b"

  val lines = Source.stdin.getLines().drop(1)
  val validation = lines.map(ipValidation)
  println(validation.mkString("\n"))

  def ipValidation(address: String): String = {
    if(address.matches(IP6_PATTERN))
      "IPv6"
    else if(address.matches(IP4_PATTERN))
      "IPv4"
    else
      "Neither"
  }
}