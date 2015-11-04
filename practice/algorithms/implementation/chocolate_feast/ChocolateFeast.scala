object ChocolateFeast extends App {
  val lines = io.Source.stdin.getLines().toList.tail
  lines.foreach {
    line =>
      val amounts = line.split(" ").map(_.toInt)
      println(chocolates(amounts(0), amounts(1), amounts(2)))
  }

  def chocolates(amount: Int, price: Int, discount: Int): Int  = {
    if(amount <= 0) {
      return 0
    }
    val count = amount / price
    return count + freeChoco(count, discount)
  }

  def freeChoco(wrappersCount: Int, discount: Int): Int = {
    if(wrappersCount < discount) {
      return 0
    }
    val free = wrappersCount / discount
    return free + freeChoco(wrappersCount - (free * discount) + free, discount)
  }
}
