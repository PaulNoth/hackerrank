object FilterPositions extends App {
  def f(arr: List[Int]): List[Int] =
    arr match {
      case x :: y :: l => y :: f(l)
      case x :: y => y
      case Nil => Nil
    }

  println(f(io.Source.stdin.getLines.toList.map(_.trim).map(_.toInt)).mkString("\n"))
}