object FibonacciNumbers {
   def fibonacci(x:Int):Int = {
      if(x == 1) 0
      else if(x == 2) 1
      else fibonacci(x - 1) + fibonacci(x - 2)
   }

    def main(args: Array[String]) {
       println(fibonacci(readInt()))
    }
}