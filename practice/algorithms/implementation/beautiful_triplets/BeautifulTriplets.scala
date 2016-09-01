object BeautifulTriplets extends App {
  val lines = Source.stdin.getLines().toList
  val d = lines(0).split(" ").map(_.toInt).toList(1)
  val array = lines(1).split(" ").map(_.toInt)

  val indices = array.indices
  var beautifulTriplets = 0
  for(i <- (0 until indices.length - 2)) {
    for (j <- ((i + 1) until indices.length - 1) if (array(j) - array(i) <= d)) {
      for (k <- ((j + 1) until indices.length) if (array(k) - array(j) <= d)) {
        if (((array(j) - array(i)) == d) && ((array(k) - array(j)) == d)) {
          beautifulTriplets += 1
        }
      }
    }
  }
  println(beautifulTriplets)
}
