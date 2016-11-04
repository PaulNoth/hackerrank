import scala.io.Source

object RepeatedString extends App {
  val lines = Source.stdin.getLines().toList
  val string = lines.head
  val letters = lines(1).toLong
  val as = string.count(_ == 'a')
  val times = letters / string.length
  val rest = letters % string.length

  val totalAs = times * as + string.substring(0, rest.toInt).count(_ == 'a')
  println(totalAs)
}