import scala.io.Source

object FunctionOrNot extends App {
  val lines = Source.stdin.getLines().toList
  val tests = lines.head.toInt
  val parts = lines.tail.partition(!_.contains(" "))
  val counts = parts._1.map(_.toInt)
  val pairs = parts._2.map(_.split(" ")).map(arr => Tuple2(arr(0).toInt, arr(1).toInt))
  var start = 0
  counts.foreach {
    i => {
      val p = pairs.slice(start, start + i)
      start = start + i
      println(if(isFunction(p)) "YES" else "NO")
    }
  }

  def isFunction(rel: List[(Int, Int)]): Boolean = {
    val groupByX = rel.groupBy(_._1)
    val filteredMoreThanOne =
      groupByX.filter(p => p._2.size > 1)
    filteredMoreThanOne.forall(_._2.map(_._2).distinct == 1)
  }
}