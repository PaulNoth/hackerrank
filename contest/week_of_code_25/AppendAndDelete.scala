import scala.io.Source

object AppendAndDelete extends App {
  val lines = Source.stdin.getLines().toList
  val s = lines(0)
  val t = lines(1)
  val k = lines(2).toInt

  if(s == t) {
    val appends = t.length
    println(if(k - appends >= t.length) "Yes" else "No")
  } else {
    val commonPrefix = s.zip(t).takeWhile(c => c._1 == c._2).map(a => a._1).mkString("")
    val prefixLength = commonPrefix.length
    val deletions = s.length - prefixLength
    val appends = t.length - prefixLength
    println(if(deletions + appends == k) "Yes" else "No")
  }
}