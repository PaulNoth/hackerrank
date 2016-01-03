import scala.io.Source

object LatituteLongitudePair extends App {

  private[this] val LATITUDE_LONGITUDE_PATTERN =
    "^\\([+-]?((90(\\.0+)?)|([1-8][0-9](\\.[0-9]+)?)|([0-9](\\.[0-9]+)?)),\\s*[+-]?(((([1-9][0-9])|([0-9]))(\\.[0-9]+)?)|(1((80(\\.0+)?)|([0-7][0-9](\\.[0-9]+)?))))\\)$"

  val lines = Source.stdin.getLines().drop(1)
  val validations = lines.map(validatePair)
  println(validations.mkString("\n"))

  def validatePair(s: String): String = {
    if(s.matches(LATITUDE_LONGITUDE_PATTERN)) {
      "Valid"
    } else {
      "Invalid"
    }
  }
}