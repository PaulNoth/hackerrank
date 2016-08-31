object Kangaroo extends App {
  val lines = Source.stdin.getLines().toList
  val numbers = lines.head.split(" ").map(_.toInt)
  val kangaroo1 = (numbers(0), numbers(1))
  val kangaroo2 = (numbers(2), numbers(3))

  println(if(sameLocation(kangaroo1, kangaroo2)) "YES" else "NO")

  def sameLocation(k1: (Int, Int), k2: (Int, Int)): Boolean = {
    val x1 = k1._1
    val x2 = k2._1
    val v1 = k1._2
    val v2 = k2._2
    if(v1 < v2) return false
    if(x1 < x2 && v1 > v2) {
      val xDiff = (x1 - x2).abs
      val vDiff = (v1 - v2).abs
      if(xDiff % vDiff == 0) {
        return true
      } else {
        return false
      }
    }
    false
  }
}
