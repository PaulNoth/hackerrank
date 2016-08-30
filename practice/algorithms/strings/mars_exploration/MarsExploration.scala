object MarsExploration extends App {
  val line = Source.stdin.getLines().toList.head
  val tris = line.grouped(3)
  val sosDiffs = tris.map(diffSignal)
  println(sosDiffs.sum)

  def diffSignal(s: String): Long = {
    (if(s(0) == 'S') 0 else 1) +
      (if(s(1) == 'O') 0 else 1) +
      (if(s(2) == 'S') 0 else 1)
  }
}
