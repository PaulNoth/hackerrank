object CookieParty {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val n = sc.nextInt()
    val m = sc.nextInt()

    val lowestMultiplier = (m.toDouble / n).ceil.toLong
    val result = (lowestMultiplier * n - m).abs
    println(result)
  }
}
