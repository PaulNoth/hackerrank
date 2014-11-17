package fp.introduction

/**
 * <p>
 * Count the number of elements in an array without using 
 * <b><tt>count</tt></b>, <b><tt>size</tt></b> or <b><tt>length</tt></b> operators (or their equivalents). 
 * The input and output portions will be handled automatically by the grader. 
 * You only need to write a function with the recommended method signature.
 * </p>
 * <p>
 * Input Format<br>
 * A list with Integers; each integer is on a new line.
 * </p>
 * <p>
 * Output Format<br>
 * A single integer N which is the length of the list which was provided as input.
 * </p>
 * 
 * @author Pidanic
 */
object ListLength extends App {

  def f(arr: List[Int]): Int = {
    var count = 0
    for (i <- arr) count += 1
    count
  }
  
  println(f(io.Source.stdin.getLines.toList.map(_.trim).map(_.toInt)))
}