import scala.io.Source

object JumpingOnTheClouds extends App {
  val lines = Source.stdin.getLines().toList
  val clouds = lines(1).split(" ").map(_.toInt)

  var steps = 0
  var index = 0
  while (index < clouds.length - 1) {
    if((index + 2 < clouds.length) && clouds(index + 2) != 1) {
      index = index + 2
    } else {
      index = index + 1
    }
    steps += 1
  }

  println(steps)
}