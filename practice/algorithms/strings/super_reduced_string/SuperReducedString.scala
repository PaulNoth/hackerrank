import scala.io.Source

object SuperReducedString extends App {
  val line = Source.stdin.getLines().toList.head
  val reduced = line.foldLeft("")(stringReduce)
  println(if(reduced.isEmpty) "Empty String" else reduced)

  def stringReduce(acc: String, c: Char): String = {
    if(acc.length > 0 && acc.charAt(acc.length - 1) == c) acc.substring(0, acc.length - 1) else acc + c
  }
}