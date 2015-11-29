object LibraryFine extends App
{
  val consoleReader = io.Source.stdin.bufferedReader()
  val actualDate = consoleReader.readLine().split(" ").map(_.toInt)
  val expectedDate = consoleReader.readLine().split(" ").map(_.toInt)

  val yearDiff = actualDate(2) - expectedDate(2)
  val monthDiff = actualDate(1) - expectedDate(1)
  val dayDiff = actualDate(0) - expectedDate(0)

  def fee(year: Int, month: Int, day: Int): Int =
  {
    if(year > 0) return 10000
    if(year == 0 && month > 0) return month * 500
    if(year == 0 && month == 0 && day > 0) return day * 15
    return 0
  }

  println(fee(yearDiff, monthDiff, dayDiff))
}
