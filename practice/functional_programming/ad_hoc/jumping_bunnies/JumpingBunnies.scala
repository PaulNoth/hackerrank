import scala.io.Source

object JumpingBunnies extends App {
  val lines = Source.stdin.getLines().toList
  val bunnies = lines(1).split(" ").map(_.toInt)

  val commonPoint = bunnies.foldLeft(BigInt(1))(lcm(_, _))

  println(commonPoint)

  def gcd(x: BigInt, y: BigInt): BigInt = {
    if(y == 0) x else gcd(y, x % y)
  }

  def lcm(x: BigInt, y: BigInt): BigInt = {
    (x * y) / gcd(x, y)
  }
}