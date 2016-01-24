import scala.collection.mutable.ListBuffer
import scala.io.Source

object MissingNumbers extends App {
  val lines = Source.stdin.getLines().filter(_.contains(" ")).toList
  val list1 = lines(0).split(" ").map(_.toInt)
  val list2 = lines(1).split(" ").map(_.toInt)
  val groupedByNumber1 = list1.groupBy(i => i)
  val groupedByNumber2 = list2.groupBy(i => i)
  println(missingNumbers(groupedByNumber1, groupedByNumber2).mkString(" "))

  def missingNumbers(a: Map[Int, Array[Int]], b: Map[Int, Array[Int]]): List[Int] = {
    val result: ListBuffer[Int] = ListBuffer.empty
    b.keys.foreach(key => {
      val presentInA = a.get(key).isDefined
      val amountB = b.get(key).get.length
      if(!presentInA || amountB > a.get(key).get.length) {
        result += key
      }
    })
    result.toList.sorted
  }
}