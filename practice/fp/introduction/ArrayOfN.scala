object ArrayOfN extends App {

  def f(num: Int): List[Int] = (1 to num).toList

  println(f(readInt).length)

}