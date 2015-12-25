import scala.io.Source

object Equations extends App {
  val input = Source.stdin.getLines().toList(0).toInt

  val result: BigInt = if(input == 1) 1 else equations(input)
  println(result % 1000007)

  def sieveEratosthenes(limit: Int): Array[Int] = {
    val result = Array.fill(limit + 1)(true)
    for(i <- 2 until result.length) {
      if(result(i)) {
        var j: BigInt = i
        while(j * i < result.length) {
          result(j.toInt * i) = false
          j += 1
        }
      }
    }
    result.indices.filter(i => i > 1 && result(i) == true).toArray
  }

  def equations(input: Int): BigInt = {
    var result: BigInt = 1
    val primes = sieveEratosthenes(input)
    primes.foreach(prime => {
      var num = input
      var exp = 0
      while (num > 0) {
        val div = num / prime
        num /= prime
        exp += div
      }
      result *= (2 * exp + 1)
    })
    return result
  }
}
