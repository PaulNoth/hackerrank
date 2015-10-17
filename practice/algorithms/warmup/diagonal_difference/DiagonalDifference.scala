object DiagonalDifference extends App {
  val lines = io.Source.stdin.getLines().toList
  val n = lines.head.toInt
  val matrix = lines.tail.toArray.map(_.split(" ").map(_.toInt))

  var leftRight = 0
  var rightLeft = 0
  (0 until n).foreach {
    i =>
      leftRight += (matrix(i))(i)
      rightLeft += (matrix(i)(n - i - 1))
  }
  println((leftRight - rightLeft).abs)
}
