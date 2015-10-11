import java.util.Locale

object PlusMinus extends App {
   val console = io.Source.stdin.bufferedReader()

   val n = console.readLine().toInt
   val arr = console.readLine().split(" ").map(_.toInt)

   println("%.3f".formatLocal(Locale.ENGLISH, arr.count(_ > 0) / n.toDouble))
   println("%.3f".formatLocal(Locale.ENGLISH, arr.count(_ < 0) / n.toDouble))
   println("%.3f".formatLocal(Locale.ENGLISH, arr.count(_ == 0) / n.toDouble))
 }
