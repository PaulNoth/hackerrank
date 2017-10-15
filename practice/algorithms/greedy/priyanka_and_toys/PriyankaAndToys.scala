object PriyankaAndToys extends App {
  val lines = Source.stdin.getLines().toList
  val n = Integer.parseInt(lines.head)
  val weights = lines.tail.head.split("\\s+").map(_.toInt).sorted
  var price = 1
  var lastWeight = weights(0)

  var i = 1
  while ( {
    i < weights.length
  }) {
    if (lastWeight + 4 >= weights(i)) {
      // lastWeight = toys[i];
    }
    else {
      price += 1
      lastWeight = weights(i)
    }

    {
      i += 1; i - 1
    }
  }
  println(price)
}
