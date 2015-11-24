object SherlockAndBeast extends App {
  val numbers = io.Source.stdin.getLines().toList.drop(1).map(_.toInt)
  val outputs = numbers.map(num => createOutput(divide(num, (num, 0))))
  println(outputs.mkString("\n"))

  def divide(num: Int, tup: (Int, Int)): (Int, Int) = {
    if(tup._1 % 3 == 0 && tup._2 % 5 == 0)
      tup
    else if(tup._1 >= 0 && tup._2 <= num)
      divide(num, (tup._1 - 5, tup._2 + 5))
    else
      (-1, -1)
  }

  def createOutput(tup: (Int, Int)): String = {
    if(tup._1 == -1) "-1"
    else "5" * tup._1 + "3" * tup._2
  }
}
