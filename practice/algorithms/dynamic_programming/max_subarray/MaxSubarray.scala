import scala.io.Source

object MaxSubarray extends App {
  val lines = Source.stdin.getLines.drop(1).toList

  val arrayLines = lines.grouped(2).map(group => group.toList(1))
  val arrays = arrayLines.map(_.split(" ").map(_.toInt))
  arrays.foreach {
    arr => {
      val contiguousSum = kadane(arr)
      val positiveNumbers = arr.filter(_ > 0)
      val nonContiguousSum = if(positiveNumbers.isEmpty) arr.max else positiveNumbers.sum
      println(contiguousSum + " " + nonContiguousSum)
    }
  }

  def kadane(arr: Array[Int]): Int = {
    var maxSoFar = arr(0)
    var maxEndings = arr(0)
    arr.slice(1, arr.length).foreach(el => {
      maxEndings = scala.math.max(el, maxEndings + el)
      maxSoFar = scala.math.max(maxSoFar, maxEndings)
    })
    maxSoFar
  }
}