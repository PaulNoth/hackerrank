import scala.collection.mutable.ListBuffer
import scala.io.Source

object IceCreamParlor extends App {
  val console = Source.stdin.bufferedReader()
  val tests = console.readLine().toInt
  (0 until tests).foreach(_ => {
    val amount = console.readLine().toInt
    val lenght = console.readLine().toInt
    val costs = console.readLine().split(" ").map(_.toInt)
    println(indexes(costs, amount).mkString(" "))
  })

  def indexes(costs: Array[Int], amount: Int): List[Int] = {
    val result: ListBuffer[Int] = ListBuffer.empty
    (0 until costs.length - 1).foreach(i => {
      (i + 1 until costs.length).foreach(j => {
        if(costs(i) + costs(j) == amount) {
          result += i + 1
          result += j + 1
        }
      })
    })
    result.toList
  }
}