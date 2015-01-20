package fp.introduction

/**
 * <p>
 * Print "Hello World" N times. The input portion will be handled automatically. 
 * You need to write a function with the recommended method signature.
 * </p>
 * <p>
 * Input Format<br>
 * An Integer N which is the number of times we need to print "Hello World".
 * </p>
 * <p>
 * Output Format<br>
 * N lines, each containing "Hello World".
 * </p>
 * 
 * @author Pidanic
 * 
 */
object HelloWorldNTimes extends App {
  def f2(i: Int): Unit = println("Hello World")

  def f(n: Int) = (1 to n).foreach(f2(_))

  var n = readInt
  f(n)
}