import scala.io.Source

object Solution{
  def countingSort(arr: Array[Int]): Array[Int] =  {
    val countsOfNumbers = arr.sorted.groupBy(i => i).map(a => (a._1, a._2.length))

    (0 until 100).flatMap { i =>
      val n = countsOfNumbers.getOrElse(i, 0)
      (0 until n).map(j => i)
    }.toArray
  }

  def main(args: Array[String]) {
    val lines = Source.stdin.getLines().toList
    val arr = lines.tail.head.split(" ").map(_.toInt)
    val result = countingSort(arr)
    println (result.mkString(" "))
  }
}