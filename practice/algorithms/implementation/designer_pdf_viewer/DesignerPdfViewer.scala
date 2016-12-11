import scala.io.Source

object DesignerPdfViewer extends App {
  val lines = Source.stdin.getLines().toList
  val heights = lines.head.split(" ").map(_.toInt)
  val word = lines(1)
  val characterIndexes = word.map(_ - 'a')
  val maxHeight = characterIndexes.map(heights(_)).max

  val square = word.length * maxHeight
  println(square)
}
