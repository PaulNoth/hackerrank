package fp.introduction

/**
 * <p>
 * Given a list repeat each element of the list n times. 
 * The input and output portions will be handled automatically by the grader. 
 * You need to write a function with the recommended method signature.
 * </p>
 * <p>
 * Input Format<br>
 * First line has integer S where S is the number of times you need to repeat elements. After this there are X lines, each containing an integer. These are the X elements of the array.
 * </p>
 * <p>
 * Output Format<br>
 * Repeat each element of the original list S times. So you totally have S*X space separated integers. The relative positions of the values should be same as the original list provided as input.
 * </p>
 * 
 * @author Pidanic
 * 
 */
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