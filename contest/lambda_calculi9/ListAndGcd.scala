import scala.collection.Iterator
import scala.collection.immutable.List

object ListAndGdc {
  def main(args: Array[String]) {
    val lines = io.Source.stdin.getLines.toList
//    val lines = Iterator.continually(Console.readLine).takeWhile(_.nonEmpty).map(_.trim).toList
    val arrays = lines.drop(1).map(_.trim.split(' ').toList.map(_.toInt))
    
    val maps = arrays.map(listToMap(_))
    val intersec = intersection(maps)
    intersec.keySet.toList.sortWith(_ < _).foreach {
      k:Int => print(k + " " + intersec.get(k).get + " ") 
    }
  }
  
  def listToMap(list: List[Int]):Map[Int, Int] = {
    list match {
      case x::y::l => Map.apply((x, y)) ++ listToMap(l)
      case x::l => throw new IllegalArgumentException("array must have even size")
      case Nil => Map.empty
    }
  }
  
  def mapsIntersection(m1: Map[Int, Int], m2: Map[Int, Int]): Map[Int, Int] = {
    var res: scala.collection.mutable.Map[Int, Int] = scala.collection.mutable.Map.empty
    m1.keySet.toList.foreach { 
      k => 
        val values1 = m1.get(k).get
        if(m2.get(k).isDefined) {
          val values2 = m2.get(k).get
          res += ((k,values1 min values2))
        }
      }
    res.toMap
  }
  
  def intersection(list: List[Map[Int, Int]]): Map[Int, Int] = {
    list.foldLeft(list.head)(mapsIntersection(_, _))
  }
}