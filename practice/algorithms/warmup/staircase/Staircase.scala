object Staircase extends App {
   val n = io.Source.stdin.bufferedReader().readLine().toInt

   Range(1, n + 1).foreach {
     i => println(stair(i, n))
   }

   def stair(i: Int, n: Int) = " " * (n - i) + "#" * i
 }
