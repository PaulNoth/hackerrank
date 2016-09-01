object MinimumDistances extends App {
  val lines = Source.stdin.getLines().toList
  val array = lines(1).split(" ").map(_.toInt)

  val indexPairs = array.indices.flatMap(i => array.indices.slice(i + 1, array.length).map(j => (i, j)))
  val equalValues = indexPairs.filter(pair => array(pair._1) == array(pair._2))
  val distances = equalValues.map(pair => (pair._1 - pair._2).abs)

  val result = if(distances.isEmpty) -1 else distances.min
  println(result)
}
