import scala.io.Source

object ModifiedKaprekarNumbers extends App {
  val lines = Source.stdin.getLines().map(_.toInt).toList
  val lower = lines(0)
  val upper = lines(1)
  val kaprekarNums = (lower to upper).filter(isKaprekar)
  val output = if(!kaprekarNums.isEmpty) kaprekarNums.mkString(" ") else "INVALID RANGE"

  def isKaprekar(num: Int): Boolean = {
    val square = Math.pow(num, 2).toInt.toString
    if(square.length > 1) {
      val parts = square.splitAt(square.length / 2)
      val l = parts._1.toInt
      val r = parts._2.toInt
      return (l + r) == num
    } else {
      return square.toInt == num
    }
  }
}