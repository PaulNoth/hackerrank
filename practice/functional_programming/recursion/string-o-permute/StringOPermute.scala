object StringOPermute extends App {
  val lines = Source.stdin.getLines().drop(1)
  val linePairs = lines.map(_.grouped(2).map(_.reverse).toList.flatten)
  println(linePairs.mkString("\n"))
}
