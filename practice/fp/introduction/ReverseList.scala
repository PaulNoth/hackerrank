object ReverseList extends App {
  def f(arr: List[Int]): List[Int] =
    (arr.foldLeft(List.empty[Int])((list, e) => e :: list))

}