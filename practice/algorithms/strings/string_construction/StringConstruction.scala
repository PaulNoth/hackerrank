object StringConstruction extends App {
  val lines = Source.stdin.getLines()
  val strings = lines.toList.tail
  val costs = strings.map(_.distinct.length)
  println(costs.mkString("\n"))
}
