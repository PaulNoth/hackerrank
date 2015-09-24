object PascalTriangle extends App {

   val k = io.Source.stdin.bufferedReader().readLine().toInt

   (0 until k).foreach {
     row =>
       println(List.range(0, row + 1)
         .map(col =>
         fact(row) / (fact(col) * fact(row - col)))
         .mkString(" "))
   }

   def fact(n: Int): Int = {
     if(n <= 1) 1
     else n * fact(n - 1)
   }
 }
