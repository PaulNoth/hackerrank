object CompareTheTriplets extends App {
  val lines = Source.stdin.getLines().toList
  val alicesRating = lines(0).split(" ").map(_.toInt)
  val bobsRating = lines(1).split(" ").map(_.toInt)

  val differentRatings = alicesRating.zip(bobsRating).filter(pair => pair._1 != pair._2)
  val aliceScore = differentRatings.count(pair => pair._1 > pair._2)
  val bobScore = differentRatings.length - aliceScore

  println(aliceScore + " " + bobScore)
}
