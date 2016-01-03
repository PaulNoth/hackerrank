import scala.io.Source
import scala.util.control.Breaks._

object InsertionSort1 extends App {
  val lines = Source.stdin.getLines.toList
  val arr = lines(1).split(" ").map(_.toInt)

  insertIntoSorted(arr)

  def insertIntoSorted(arr: Array[Int]): Unit = {
    val insertionValue = arr(arr.length - 1)
    var placed = false
    breakable {
      Range(arr.length - 2, -1, -1).foreach(i => {
        if (arr(i) > insertionValue) {
          arr(i + 1) = arr(i)
          printArray(arr)
        } else {
          arr(i + 1) = insertionValue
          printArray(arr)
          placed = true
          break
        }
      })
    }
    if(!placed) {
      arr(0) = insertionValue
      printArray(arr)
    }
  }

  def printArray(arr: Array[Int]): Unit = {
    println(arr.mkString(" "))
  }
}
