object SaveThePrisoner extends App {
  val lines = Source.stdin.getLines().toList
  val statements = lines.tail
  val savedPrisoners = statements.map(savedPrisoner)

  println(savedPrisoners.mkString("\n"))

  def savedPrisoner(line: String): Long = {
    val numbers = line.split(" ").map(_.toLong)
    val prisoners = numbers(0)
    val sweets = numbers(1)
    val startId = numbers(2)

    val saved = (((sweets % prisoners) + startId) % prisoners) - 1
    if (saved == 0) prisoners else saved
  }
}
