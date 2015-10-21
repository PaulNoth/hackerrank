import scala.collection.immutable.TreeMap

object Encryption extends App {
  val input = io.Source.stdin.bufferedReader().readLine()
  val height = Math.ceil(Math.sqrt(input.length))
  val width = Math.floor(Math.sqrt(input.length))
  val groupByColumn = TreeMap(input.indices.toList.groupBy(_ % height).toArray:_*).values
  val encrypted = groupByColumn.map(_.map(input.charAt).mkString("")).mkString(" ")
  println(encrypted)
}
