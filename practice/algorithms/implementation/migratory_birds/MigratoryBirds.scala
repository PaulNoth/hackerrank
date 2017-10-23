import scala.io.Source

object Solution extends App {
  val lines = Source.stdin.getLines().toList
  val birds = lines.tail.head.split(" ").map(_.toInt)

  val birdGroups = birds.groupBy(b => b).map(group => (group._1, group._2.length))
  val biggestGroup = birdGroups.foldLeft((0, 0))((maxBirdCountType, group) => {
    val birdType = group._1
    val birdTypeCount = group._2
    if(maxBirdCountType._2 < birdTypeCount) {
      (birdType, birdTypeCount)
    } else {
      maxBirdCountType
    }
  })

  println(biggestGroup._1)
}