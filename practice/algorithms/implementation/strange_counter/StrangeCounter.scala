object StrangeCounter extends App {
  val sc = new java.util.Scanner (System.in)
  val t = sc.nextLong()

  val cycle = Math.sqrt((t.toDouble / 3).ceil).ceil.toLong
  val cycleEndTime = cycleEnd(t, 0, 3)
  val timeDiff = cycleEndTime - t
  val finalValue = timeDiff + 1

  println(finalValue)

  def cycleEnd(time: Long, start: Long, step: Long): Long = {
    if(start > time) {
      return start
    }
    cycleEnd(time, start + step, step * 2)
  }
}
