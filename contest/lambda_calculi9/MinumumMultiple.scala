object MinumumMultiple extends App {
  val lines = io.Source.stdin.getLines.toList
  //val lines = Iterator.continually(Console.readLine).takeWhile(_.nonEmpty).map(_.trim).toList
  val arraySize = lines(0).toInt
  var array = lines(1).split(" ").map(_.toLong).toArray
  val queriesSize = lines(2).toInt
  val queries = lines drop 3
  queries.foreach { query =>
    val q = query.split(" ")
    val command = query(0)
    if(command.toChar == 'Q') {
      println(arrayLcm(array, q(1).toInt, q(2).toInt))
    } else if(command.toChar == 'U') {
      updateArray(array, q(1).toInt, q(2).toInt)
    }
  }

  def gcd(a: Long, b: Long): Long = {
    if (b == 0) a else gcd(b, a % b)
  }

  def lcm(a: Long, b: Long): Long = {
    (a * b) / gcd(a, b)
  }

  def arrayLcm(arr: Array[Long], from: Int, toIndex: Int): Long = {
    var result:Long  = 1
    for(i <- from to toIndex)
      result = lcm(result, arr(i))
    result % 1000000007
  }

  def updateArray(arr: Array[Long], index:Int, value:Int):Unit = {
    arr(index) = arr(index) * value
  }
}