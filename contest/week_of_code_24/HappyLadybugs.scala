import scala.io.Source
import java.util.Scanner

object Solution extends App {
  val stdin = new Scanner(System.in)
  val tests = stdin.nextInt()

  (0 until tests).foreach {
    _ => {
     val b = stdin.nextInt()
     val board = stdin.next()
     //val colorCounts = board.toCharArray.filter(_ != '_').groupBy(c => c)
     //val empty = board.count(_ == '_')
     //val colorLowerTwo = colorCounts.exists(_._2.length <= 1)
     val is = isHappy(board)
     println(if(is) "YES" else "NO")
   }
 }

  def isHappy(board: String): Boolean = {
    val colorCounts = board.toCharArray.filter(_ != '_').groupBy(c => c)
    val empty = board.count(_ == '_')
    val colorLowerTwo = colorCounts.exists(_._2.length <= 1)
    if(empty > 0) {
      if(colorCounts.isEmpty) return true
      if(!colorLowerTwo) return true
      return false
    } else {
      val exists = board.indices.slice(0, board.length - 2).map(_ + 1)
	        .forall(i => (board.charAt(i) == board.charAt(i + 1)) || (board.charAt(i) == board.charAt(i - 1)))
      if(exists) return true
      return false
    }
    false
   }
 }
