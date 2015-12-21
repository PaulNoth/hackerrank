import scala.io.Source

object DetectHtmlTags extends App {
  private[this] val TAG_PATTERN = "<\\s*[a-z0-9]+"

  val lines = Source.stdin.getLines().drop(1)

  val tags = lines.map(parseTags).flatten.toList
  val tagsSet = tags.distinct.sorted
  println(tagsSet.mkString(";"))

  def parseTags(s: String): Iterator[String] = {
    TAG_PATTERN.r.findAllMatchIn(s).map(_.toString).map(_.replaceAll("<", ""))
  }
}
