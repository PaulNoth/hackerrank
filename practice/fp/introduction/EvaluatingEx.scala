package fp.introduction

/**
 * <p>
 * The series expansion of <tt>e<sup>x</sup></tt> is given by:
 * </p>
 * <pre>
 * 1 + x + x2/2! + x3/3! + x4/4! + .......
 * </pre>
 * <p>
 * Evaluate <tt>e<sup>x</sup></tt> for given values of <tt>x</tt>, by using the above expansion for the first 10 terms.
 * </p>
 * <p>
 * Input Format <br>
 * The first line contains an integer number N 
 * which will be the number of test cases. N lines follow, 
 * each line containing a value of <tt>x</tt> for which you need to 
 * output the value of <tt>e<sup>x</sup></tt> using the above series expansion.
 * These input values have exactly 4 decimal places each.
 * </p>
 * <p>
 * Output Format<br>
 * N lines, each of them containing the value of <tt>e<sup>x</sup></tt>, computed by your program.
 * </p>
 * <p>
 * Constraints<br>
 * 1 <= N <= 50 <br>
 * -20.00 <= x <= 20.00 <br>
 * Var, Val in Scala; def and defn in Clojure are blocked keywords. 
 * The challenge is to accomplish this without either mutable state, 
 * or direct declaration of local variables.
 * </p>
 * 
 * @author Pidanic
 */
object EvaluatingEx extends App {
  def f(x: Double): Double =
    {
      f2(x, 9)
    }

  def fact(x: Int): Int = if (x <= 1) 1 else x * fact(x - 1)

  def f2(x: Double, i: Int): Double =
    {
      if (i == 0) 1 else Math.pow(x, i) / fact(i) + f2(x, i - 1)
    }

  val n = readInt
  (1 to n) foreach (x => println(f(readFloat())))
}