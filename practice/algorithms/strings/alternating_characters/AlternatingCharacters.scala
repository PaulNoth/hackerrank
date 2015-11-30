import scala.io.Source

object AlternatingCharacters extends App {
  val strings = Source.stdin.getLines().drop(1)

  println(strings.map(deletions).mkString("\n"))

  def deletions(s: String):Int = {
    var last = s.charAt(0)
    var dels = 0
    s.drop(1).foreach {
      c => {
        if (last == c) {
          dels += 1
        } else {
          last = c
        }
      }
    }
    dels
  }
}
