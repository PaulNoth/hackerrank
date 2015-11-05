import scala.io.Source

object UtopianTree extends App {
  val nums = Source.stdin.getLines().toList.tail.map(_.toInt)
  nums.foreach(i => println(tree(0, i, 1)))

  def tree(actualCycle: Int, cycles: Int, height: Int): Int = {
    if(actualCycle == cycles) {
      return height
    }
    if(actualCycle % 2 == 0) tree(actualCycle + 1, cycles, height * 2)
    else tree(actualCycle + 1, cycles, height + 1)
  }
}