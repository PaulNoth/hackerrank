object FilterArray extends App {

  def f(num: Int, arr: List[Int]): List[Int] = arr.filter(_ < num)

  var lines = io.Source.stdin.getLines.toList
  println(f(lines(0).toInt, lines.map(_.trim).map(_.toInt)).map(_.toString).mkString("\n"))

}