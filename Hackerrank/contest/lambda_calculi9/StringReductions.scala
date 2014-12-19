package lambda_calculi9

/**
 *
 * <p>
 * Given a string, str= "s<sub>1</sub>s<sub>2</sub>...s<sub>n</sub>", consisting of n lower case latin characters ('a'-'z'),
 * remove all of the characters that occurred previously in the string.
 * That is, remove all characters, si, for which
 * <tt>∃j,s<sub>j</sub>=s<sub>i</sub> and j<i</p>
 * </p><p>
 * Input Format<br>
 * Input will contain a string str of length <tt>n</tt>.
 * </p>
 * <p>
 * Output Format<br>
 * Print the string after removing all characters that occurred previously.
 * </p><p>
 * Constraints<br>
 * 1<=<=10<sup>5</sup><br>
 * s<sub>i</sub> in {'a', 'b',..., 'z'}, where 1<=i<=n</p><p>
 * Sample Input #00
 * <br>
 * accabb</p><p>
 * Sample Output #00
 * <br>
 * acb
 * </p>
 *
 * @author Pidanic
 */
object StringReductions extends App {
  println(Console.readLine.distinct)
}