import scala.collection.mutable
import scala.io.Source

object Solution extends App {
  val lines = Source.stdin.getLines().toList.tail
  lines.grouped(2).foreach(group => {
    val (n, k) = group(0).split(" ").map(_.toInt).toList match {
      case a::b::Nil => (a, b)
    }
    val elements = group(1).split(" ").toList.map(_.toInt)
    val groups = mutable.LinkedHashMap[Int, Int]()
    elements.foreach(element => {
      groups.put(element, groups.getOrElse(element, 0) + 1)
    })

    val results = groups.filter(g => g._2 >= k).map(g => g._1)
    println(if(results.isEmpty) "-1" else results.mkString(" "))
  })
}