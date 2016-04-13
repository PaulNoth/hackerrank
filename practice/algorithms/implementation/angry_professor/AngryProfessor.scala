import scala.io.Source

object AngryProfessor extends App {
  val lines = Source.stdin.getLines().drop(1)
  val inputs = lines.grouped(2).map(_.toList)
  inputs.foreach {
    input => {
      val studentsAndCancelation = input(0).split("\\s+").map(_.toInt)
      val students = studentsAndCancelation(0)
      val cancelation = studentsAndCancelation(1)
      val arrivals = input(1).split("\\s+").map(_.toInt)
      val cancelled = if(cancelation > studentsBeforeClass(arrivals)) "YES" else "NO"
      println(cancelled)
    }
  }

  def studentsBeforeClass(arrivals: Array[Int]): Int = {
    arrivals.count(_ <= 0)
  }
}