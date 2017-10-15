object BirthdayCakeCandles {

  def birthdayCakeCandles(n: Int, ar: Array[Int]): Int =  {
    val candleHeightGroups: Map[Int, Seq[Int]] = ar.toList.groupBy(i => i)
    val maxHeight = candleHeightGroups.keys.max
    candleHeightGroups.getOrElse(maxHeight, Seq.empty).size
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val n = sc.nextInt()
    val ar = new Array[Int](n)
    for(ar_i <- 0 until n) {
      ar(ar_i) = sc.nextInt()
    }
    val result = birthdayCakeCandles(n, ar)
    println(result)
  }
}
