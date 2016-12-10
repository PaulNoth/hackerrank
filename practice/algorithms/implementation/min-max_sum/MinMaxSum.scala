object MinMaxSum {

  def main(args: Array[String]) {
    val ints = scala.io.Source.stdin.getLines.toList.head.split(" ").map(_.toLong)
    val minsum = ints.sorted.init.sum
    val maxsum = ints.sorted.tail.sum
    println(minsum + " " + maxsum)
  }
}