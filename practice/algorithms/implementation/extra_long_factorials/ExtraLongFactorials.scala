object ExtraLongFactorials extends App
{
  def factorial(n: BigInt): BigInt =
  {
    if(n < 1) 1 else n * factorial(n - 1)
  }

  val n = io.Source.stdin.bufferedReader().readLine().toInt;
  println(factorial(n))
}
