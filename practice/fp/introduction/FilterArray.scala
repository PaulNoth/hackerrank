package fp.introduction


/**
 * <p>Filter a given array of integers and leave only that values which are less than a specified value X. The integers in the output should be in the same sequence as they were in the input. You need to write a function with the recommended method signature for the languages mentioned below. For rest of language you have to write complete code.
 * </p>
 * <p>
 * Input Format<br>
 * The first line contains the delimiter X. This is followed by a list of integers, which represents the elements of list/array. You have to read input to the End-Of-File.
 * </p>
 * <p>
 * Output Format<br>
 * Print integers in separate line from the array which are less than an upper-limit X in value. The sequence should be same as it was in the original array.
 * </p>
 * <p>
 * Note<br>
 * You have to write your own implementation of filter function. Use of inbuilt library function is deprecated.
 * </p>
 * @author Pidanic
 */
object FilterArray extends App {

  def f(num: Int, arr: List[Int]): List[Int] = arr.filter(_ < num)

  var lines = io.Source.stdin.getLines.toList
  println(f(lines(0).toInt, lines.map(_.trim).map(_.toInt)).map(_.toString).mkString("\n"))

}