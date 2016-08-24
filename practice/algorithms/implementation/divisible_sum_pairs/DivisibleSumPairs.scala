object DivisibleSumPairs extends App {
  val lines = Source.stdin.getLines().toList
  val divisor = lines(0).split(" ").map(_.toInt).toList(1)
  val array = lines(1).split(" ").map(_.toInt)

  val indexPairs = array.indices.flatMap(i => array.indices.slice(i + 1, array.length).map(j => (i, j)))
  val divisible = indexPairs.count(pair => (array(pair._1) + array(pair._2)) % divisor == 0)
  println(divisible)
}
