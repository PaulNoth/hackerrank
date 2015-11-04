import scala.collection.immutable.TreeSet
import scala.io.Source

object ManasaAndStones extends App {
  val console = Source.stdin.bufferedReader()
  val t = console.readLine().toInt
  (1 to t).foreach {
    i =>
      val n = console.readLine().toInt
      val a = console.readLine().toInt
      val b = console.readLine().toInt
      println(treasures(Set(0), 1, n, a, b).mkString(" "))
  }

  def treasures(l: Set[Int], depth: Int, n: Int, a: Int, b: Int): Set[Int] = {
    if(depth == n) l
    else treasures(TreeSet((l.map(_ + a).toList ++ l.map(_ + b).toList) :_*), depth + 1, n, a, b)
  }
}