import java.math.BigInteger
import java.util.Scanner

object Solution extends App {

  val scanner = new Scanner(System.in)
  val players = scanner.next.toInt
  val topics = scanner.next.toInt
  val teamTopics = new Array[BigInteger](players)
  var i = 0
  while ( {
    i < players
  }) {
    val input = scanner.next
    val binary = new BigInteger(input, 2)
    teamTopics(i) = binary

    {
      i += 1; i - 1
    }
  }

  val knownTopicsPerTeam = for {
    i <- 0 until players
    j <- i until players
  } yield {
    val commonTopics = teamTopics(i).or(teamTopics(j))
    knownTopics(commonTopics, topics)
  }

  val maxTopics = knownTopicsPerTeam.toList.max
  val teams = knownTopicsPerTeam.count(_ == maxTopics)
  println(maxTopics)
  println(teams)

  private def knownTopics(binary: BigInteger, topics: Int): Int = {
    (0 until topics).map(binary.testBit).count(_ == true)
  }
}
