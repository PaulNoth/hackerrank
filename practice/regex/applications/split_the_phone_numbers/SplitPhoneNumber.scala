import scala.io.Source

object SplitPhoneNumber extends App {

  private[this] val SPLIT_PATTERN = " |\\-"

  val numbers = Source.stdin.getLines().drop(1)

  numbers.foreach(num => {
    val splits = num.split(SPLIT_PATTERN)
    println(s"CountryCode=${splits(0)},LocalAreaCode=${splits(1)},Number=${splits(2)}")
  })
}