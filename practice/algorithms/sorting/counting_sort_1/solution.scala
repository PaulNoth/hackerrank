import scala.io.Source

object Solution{
  def countingSort(arr: Array[Int]): Array[Int] =  {
    val countsOfNumbers = arr.sorted.groupBy(i => i).map(a => (a._1, a._2.length))

    (0 until 100).map(countsOfNumbers.getOrElse(_, 0)).toArray
  }

  def main(args: Array[String]) {
    val lines = Source.stdin.getLines().toList
    val arr = lines.tail.head.split(" ").map(_.toInt)
    val result = countingSort(arr)
    println (result.mkString(" "))
  }
}