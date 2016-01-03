import scala.io.Source

object IntroToTutorialChallenges extends App {
  val lines = Source.stdin.getLines().toList
  val searchedValue = lines(0).toInt
  val array = lines(2).split(" ").map(_.toInt)

  val valPosition = getPosition(array, searchedValue)
  println(valPosition)

  def getPosition(array: Array[Int], value: Int): Int = {
    array.indexOf(value)
  }
}