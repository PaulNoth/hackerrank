object StockPediction extends App{

  val lines = io.Source.stdin.getLines.toList
  //val lines = Iterator.continually(Console.readLine).takeWhile(_.nonEmpty).map(_.trim).toList
  val arrayLength = lines(0).toInt
  val array = lines(1).split(" ").map(_.toInt)
  val queriesLength = lines(2).toInt
  val queries = lines.drop(3)
  queries.foreach {
    query =>
      val a = query.split(" ").map(_.toInt)
      val d = a(0)
      val margin = a(1)
//      array.take
      println(array.drop(array.indexWhere(_ >= array(d))).takeWhile(stock(_, array(d), margin)).length)
  }

  def stock(a: Int, d: Int, margin: Int): Boolean =
    a >= d && a <= d + margin
}