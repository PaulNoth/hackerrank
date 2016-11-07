import scala.io.Source

object ViralAdvertising extends App {
  val n = Source.stdin.bufferedReader().readLine().toInt

  println(like(5).take(n).sum)


  def like(start: Long): Stream[Long] = {
    val liked = start / 2
    val received = liked * 3
    liked #:: like(received)
  }
}