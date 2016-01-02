import scala.io.Source
import scala.collection.mutable.Map

object DetectHtmlAttributes extends App {

  private[this] val TAG_WITH_ATTRIBUTE_REGEX =
    "<[a-z0-9]+(\\s+[a-z]+=[\\\"\\'][a-zA-Z\\[\\]\\-\\/\\\\:\\.\\s_\\?!\\d;\\(\\),#@\\{\\}=%\\&\\|\\+\\*]*[\\\"\\'])*(\\s+/)?>".r
  private[this] val TAG_NAME_REGEX = "<[a-z0-9]+".r
  private[this] val ATTRIBUTE_REGEX =
    "[a-z]+=[\\\"\\'][a-zA-Z\\[\\]\\-\\/\\\\:\\.\\s_\\?!\\d;\\(\\),#@\\{\\}=%\\&\\|\\+\\*]*[\\\"\\']".r
  private[this] val ATTRIBUTE_VALUE_PATTERN = "=[\\\"\\'][a-zA-Z\\[\\]\\-\\/\\\\:\\.\\s_\\?!\\d;\\(\\),#@\\{\\}=%\\&\\|\\+\\*]*[\\\"\\']"

  val lines = Source.stdin.getLines().drop(1).toList
  val tagsWithAttributes = lines.map(findTagsWithAttributes).flatten
  val tagNames = tagsWithAttributes.map(parseTagName).flatten
  val attributes = tagsWithAttributes.map(parseAttributes)
  val tagGroups = groupAttributesByTags()
  createOutput()

  def findTagsWithAttributes(line: String): List[String] = {
    TAG_WITH_ATTRIBUTE_REGEX.findAllMatchIn(line).map(_.toString()).toList
  }

  def parseTagName(tag: String): List[String] = {
    TAG_NAME_REGEX.findAllMatchIn(tag).map(_.toString).map(_.replace("<", "")).toList
  }

  def parseAttributes(tag: String): List[String] = {
    ATTRIBUTE_REGEX.findAllMatchIn(tag).map(_.toString)
      .map(_.replaceAll(ATTRIBUTE_VALUE_PATTERN, "")).toList
  }

  def groupAttributesByTags(): Map[String, List[String]] = {
    val tagGroups: Map[String, List[String]] = Map.empty
    tagNames.indices.foreach(i => {
      val tag = tagNames(i)
      val attributeList = attributes(i)
      val actualAttributes = tagGroups.getOrElse(tag, Nil)
      tagGroups.put(tag, attributeList:::actualAttributes)
    })
    tagGroups
  }

  def createOutput(): Unit = {
    val sortedKeys = tagGroups.keys.toList.sorted
    sortedKeys.foreach(tag => {
      val sortedAttributes = tagGroups.get(tag).get.distinct.sorted
      println(tag + ":" + sortedAttributes.mkString(","))
    })
  }
}
