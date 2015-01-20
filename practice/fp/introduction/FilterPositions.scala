package fp.introduction

/**
 * <p>
 * For a given list with N integers, return a new list removing the elements at odd indices. 
 * The input and output portions will be handled automatically. 
 * You need to write a function with the recommended method signature.
 * </p>
 * <p>
 * Input Format<br>
 * N integers contained in the list, each on a new line.
 * </p>
 * <p>
 * Output Format<br>
 * List of integers, with integers at odd positions removed. 
 * The relative positions should be same as they were in the original array. 
 * Each integer will be on a new line.
 * </p>
 * <p>
 * Please note, that by "odd positions" we mean the first, third, 
 * fifth position of the array need to be filtered out.
 *  As per programming language conventions, these might correspond to indices 0, 2, 4 and so on.
 * </p>
 * 
 * @author Pidanic
 */
object FilterPositions extends App {
  def f(arr: List[Int]): List[Int] =
    arr match {
      case x :: y :: l => y :: f(l)
      case x :: y => y
      case Nil => Nil
    }

  println(f(io.Source.stdin.getLines.toList.map(_.trim).map(_.toInt)).mkString("\n"))
}