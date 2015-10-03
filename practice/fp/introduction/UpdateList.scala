object UpdateList extends App {
  
  def f(arr: List[Int]): List[Int] = if (arr.isEmpty) Nil else arr.head.abs :: f(arr.tail)
  
}