object ListLength extends App {

  def f(arr: List[Int]): Int = {
    var count = 0
    for (i <- arr) count += 1
    count
  }
  
  println(f(io.Source.stdin.getLines.toList.map(_.trim).map(_.toInt)))
}