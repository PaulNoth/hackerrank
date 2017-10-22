object Solution extends App {
  val line = Source.stdin.getLines().toList.head

  val subs = uniformSubstrings(line)
  val substringCompressed = subs.map(s => {
    val length = s.length
    if(length > 1) {
      s.head.toString + length
    } else {
      s.head.toString
    }
  })

  println(substringCompressed.mkString(""))


  def uniformSubstrings(s: String): List[String] = {
    if(s.length <= 0) {
      return Nil
    }
    val c = s.charAt(0)
    val substring = s.takeWhile(_ == c)
    substring :: uniformSubstrings(s.drop(substring.length))
  }
}
