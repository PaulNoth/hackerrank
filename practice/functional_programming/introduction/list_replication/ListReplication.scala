object ListReplication extends App {

  def f(num: Int, arr: List[Int]): List[Int] = if (arr.isEmpty) Nil else List.fill(num)(arr.head) ::: f(num, arr.tail)

  def f2(num: Int, arr: List[Int]): List[Int] =
    arr match {
      case x :: xs => List.fill(num)(x) ::: f2(num, xs)
      case Nil => Nil
    }

  def displayResult(arr: List[Int]) = println(f(arr(0).toInt, arr.drop(1)).map(_.toString).mkString("\n"))

  displayResult(io.Source.stdin.getLines.toList.map(_.trim).map(_.toInt))
}