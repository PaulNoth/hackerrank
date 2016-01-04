import scala.io.Source

object TwoArrays extends App {
  val console = Source.stdin.bufferedReader()
  val tests = console.readLine().toInt
  val descendingSort = (i: Int, j: Int) => i > j
  (0 until tests).foreach(i => {
    val line = console.readLine()
    val numbers = line.split(" ").map(_.toInt)
    val n = numbers(0)
    val sum = numbers(1)
    val array1 = console.readLine().split(" ").map(_.toInt)
    val array2 = console.readLine().split(" ").map(_.toInt)
    val sortedArray1 = array1.sorted
    val sortedArray2 = array2.sortWith(descendingSort)
    println(prove(sortedArray1, sortedArray2, sum))
  })

  def prove(arr1: Array[Int], arr2: Array[Int], sum: Int): String = {
    val correct = arr1.indices.forall(i => {arr1(i) + arr2(i) >= sum})
    if(correct)
      "YES"
    else
      "NO"
  }
}