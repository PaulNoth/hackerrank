package fp.introduction

/**
 * <p>
 * Reverse a list without using <b>reverse</b> function. 
 * The input and output portions will be handled automatically. 
 * You need to write a function with the recommended method signature.
 * </p>
 * <p>
 * Input and Output Format <br>
 * Each element of the list is displayed on a new line.
 * The output list is the reverse of the input list.
 * </p>
 * 
 * @author Pidanic
 */
object ReverseList extends App {
  def f(arr: List[Int]): List[Int] =
    (arr.foldLeft(List.empty[Int])((list, e) => e :: list))

}