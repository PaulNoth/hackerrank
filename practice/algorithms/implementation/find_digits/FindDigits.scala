object FindDigits extends App {
  var inputs = io.Source.stdin.getLines().toList.tail

  inputs.foreach {
    in =>
      println(in.toCharArray.count(d =>
        d.getNumericValue != 0 && in.toInt % d.getNumericValue == 0))
  }
}
