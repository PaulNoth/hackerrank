
object MaxMin extends App {
  val size = readInt()
  val k    = readInt()
  val input = (1 to size).map(_ => readInt()).toVector.sorted
  println((0 to (size - k)).map(i => input(i + (k-1)) - input(i)).min)
}