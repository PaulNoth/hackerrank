import scala.io.Source
import java.util.Scanner

object AppleAndOrange extends App {
  val stdin = new Scanner(System.in)
  val s = stdin.nextInt()
  val t = stdin.nextInt()
  val a = stdin.nextInt()
  val b = stdin.nextInt()
  val m = stdin.nextInt()
  val n = stdin.nextInt()
  val apples = (0 until m).map(_ => stdin.nextInt())
  val oranges = (0 until n).map(_ => stdin.nextInt())
  val fallenApples = apples.count(ap => (a + ap >= s) && (a + ap <= t))
  val fallenOranges = oranges.count(o => (b + o >= s) && (b + o <= t))
	        
  println(fallenApples)
  println(fallenOranges)
}
