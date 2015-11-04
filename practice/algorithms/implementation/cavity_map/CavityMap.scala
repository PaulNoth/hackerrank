import scala.io.Source

object CavityMap extends App {

  val lines = Source.stdin.getLines().toList
  val n = lines.head.toInt
  val map = lines.tail.mkString

  val innerIndexes = map.indices.filter(
    i => i > n && i < n * (n - 1) - 1 && Set(Range(1, n - 1, 1) :_*).contains(i % n))
  val cavitiesIndexes = innerIndexes.filter(isCavity(map, _, n)).toSet
  println(map.indices.map(toCavity(map, cavitiesIndexes, _))
    .mkString.grouped(n).mkString("\n"))

  def neighbours(index: Int, n: Int): List[Int] = {
    List(index - 1, index + 1, index - n, index + n)
  }

  def isCavity(map: String, index: Int, n: Int): Boolean = {
    val depth = Character.digit(map.charAt(index), 10)
    neighbours(index, n).forall(i => Character.digit(map.charAt(i), 10) < depth)
  }

  def toCavity(map: String, cavities: Set[Int], index: Int) = {
    if(cavities.contains(index)) 'X' else map.charAt(index)
  }
}
