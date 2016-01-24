import scala.io.Source
import scala.util.control.Breaks._

object Pairs extends App {
  val lines = Source.stdin.getLines().toList
  val definition = lines(0).split(" ").map(_.toInt)
  val diff = definition(1)
  val array = lines(1).split(" ").map(_.toInt).sorted
  var pairs = 0
  (0 until array.length - 1).foreach(i => {
    breakable {
      (i + 1 until array.length).foreach(j => {
        if (array(j) - array(i) == diff) {
          pairs += 1
          break
        }
      })
    }
  })

  println(pairs)
}