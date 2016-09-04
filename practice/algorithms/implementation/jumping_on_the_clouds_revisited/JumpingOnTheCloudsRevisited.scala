object JumpingOnTheCloudsRevisited extends App {
  val lines = Source.stdin.getLines().toList
  val nk = lines.head.split(" ").map(_.toInt)
  val n = nk(0)
  val k = nk(1)
  val clouds = lines(1).split(" ").map(_.toInt)
  var energy = 100
  var pos = k
  while(pos != 0) {
    energy -= (if(clouds(pos) == 1) 3 else 1)
    pos = (pos + k) % n
  }
  println(energy)
}
