import scala.io.Source

object MaximizingXor extends App {
  val lines = Source.stdin.getLines().toList
  val l = lines(0).toInt
  val r = lines(1).toInt
  val maxXor = (l: Int, r: Int) => {
    var max = 0
    (l to r).foreach(
      i => {
        (l to r).foreach(
          j => {
            val xor = i ^ j
            if (xor > max) max = xor
          })
      }
    )
    max
  }

  println(maxXor(l, r))
}
