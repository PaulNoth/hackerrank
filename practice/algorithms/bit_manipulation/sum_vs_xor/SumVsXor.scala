object SumVsXor extends App {
  val n = Source.stdin.bufferedReader().readLine().toLong
  val satisfied = Math.pow(2L, if(n == 0L)
    0
  else
    n.toBinaryString.count(_ == '0')).toLong

  println(satisfied)
}
