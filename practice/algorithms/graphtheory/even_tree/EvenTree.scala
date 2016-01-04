import scala.io.Source
import scala.collection.mutable.Map

object EvenTree extends App {
  val lines = Source.stdin.getLines().toList
  val count = lines.head.split(" ").map(_.toInt)
  val vertices = count(0)
  val edges = count(1)
  val edgesDesc = lines.tail

  val tree = Array.fill(vertices + 1)(0)
  val treeMap: Map[Int, Int] = Map.empty

  edgesDesc.foreach(desc => {
    val nums = desc.split(" ").map(_.toInt)
    val connected = nums(0)
    val parent = nums(1)
    tree(connected) = parent
    if(!treeMap.get(parent).isDefined) {
      treeMap.put(parent, 1)
    }
    if(!treeMap.get(connected).isDefined) {
      treeMap.put(connected, 1)
    }

    val count = treeMap.get(parent).get
    treeMap.put(parent, count + 1)
  })

  var result = 0
  for(nodeIndex <- Range(tree.length - 1, 1, -1)) {
    if(treeMap.get(nodeIndex).get % 2 == 0) {
      var hasEven = false
      for (i <- Range(tree.length - 1, 1, -1)) {
        if(tree(i) == nodeIndex) {
          val node = i
          if(treeMap.get(node).get % 2 == 0) {
            hasEven = true
          }
        }
      }
      if(!hasEven) {
        result += 1
        val parent = tree(nodeIndex)
        tree(nodeIndex) = 0
        val count = treeMap.get(parent).get
        treeMap.put(parent, count - 1)
      }
    }
  }
  println(result)
}