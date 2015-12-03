import scala.io.Source

object Pangrams extends App {
  println(
    if(Source.stdin.bufferedReader().readLine().toLowerCase().distinct.replaceAll("\\s+", "").distinct.length == 26)
      "pangram"
    else
      "not pangram"
  )
}
