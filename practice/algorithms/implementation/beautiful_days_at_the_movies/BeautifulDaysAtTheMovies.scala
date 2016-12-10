import scala.io.Source

object BeautifulDaysAtTheMovies extends App {
  val nums = Source.stdin.bufferedReader().readLine().split(" ").map(_.toInt)
  val start = nums(0)
  val end = nums(1)
  val d = nums(2)

  val beautifulNum = (start to end).count(num => {
    val reversed = num.toString.reverse.toInt
    val diff = (num - reversed).abs
    diff % d == 0
  })

  println(beautifulNum)
}