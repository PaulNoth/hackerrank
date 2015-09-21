object SolveMeSecond extends App {
  val n = readInt
  //recommended
  (1 to n).map(i => readLine.split(" ").map(_.toInt).sum).foreach(println)

  /*
    another way
    for (i <- 1 to n) {
    val Array(a, b) = readLine.split(" ").map(_.toInt)
    println(a + b)
  }
  */
}
