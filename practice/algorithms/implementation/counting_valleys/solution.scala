import scala.io.Source

object Solution extends App {
  val lines = Source.stdin.getLines().toList
  val steps = lines.tail.head

  var valleys = 0
  var seaLevel = 0
  steps.foreach(c => {
    if(c == 'D') {
      seaLevel -= 1
    } else {
      seaLevel += 1
    }
    if(seaLevel == 0 && c == 'U') {
      valleys += 1
    }
  })

  println(valleys)
}