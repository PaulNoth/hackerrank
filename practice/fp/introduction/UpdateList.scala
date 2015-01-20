package fp.introduction

/**
 * <p>
 * Update the values of a list with their absolute values. 
 * The input and output portions will be handled automatically during grading. 
 * You only need to write a function with the recommended method signature.
 * </p>
 * <p>
 * Input Format<br>
 * There are N integers, each on a new line. These are the N elements of the input array.
 * </p>
 * <p>
 * Output Format</p>
 * N integers each on a new line; these are the absolute values of the input list, in that order.
 * </p>
 */
object UpdateList extends App {
  
  def f(arr: List[Int]): List[Int] = if (arr.isEmpty) Nil else arr.head.abs :: f(arr.tail)
  
}