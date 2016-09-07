object JumpingOnTheCloudsRevisited extends App {
  val lines = Source.stdin.getLines().toList
  val nk = lines.head.split(" ").map(_.toInt)
  val n = nk(0)
  val k = nk(1)
  val clouds = lines(1).split(" ").map(_.toInt)
  var energy = 100
  var pos = k % n
  energy -= (if(clouds(pos) == 1) 3 else 1)
  while(pos != 0) {
    pos = (pos + k) % n
    energy -= (if(clouds(pos) == 1) 3 else 1)
  }
  println(energy)
}
