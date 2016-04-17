object SherlockAndSquares extends App {
  val tests = Source.stdin.getLines().drop(1)
  val numberIntervals = tests.map(line => line.splitAt(line.indexOf(" ")))
    .map(tuple => (tuple._1.trim.toInt, tuple._2.trim.toInt))
  val squareNumbers = numberIntervals.map(getSquareNumbers)
  println(squareNumbers.mkString("\n"))

  def getSquareNumbers(interval: (Int, Int)): Int = {
    val lower = interval._1
    val upper = interval._2
    if(lower == upper)
      if(Math.sqrt(lower) == Math.ceil(Math.sqrt(lower)))
        1
      else
        0
    else
      (Math.floor(Math.sqrt(upper)) - (Math.ceil(Math.sqrt(lower))) + 1).toInt
  }
}
