package fp.introduction

import scala.collection.immutable.List

/**
 * Create an array of N integers, where N is specified as input. 
 * This can be any array with N integers.
 *
 * @author Pidanic
 */
object ArrayOfN extends App {

  def f(num: Int): List[Int] = (1 to num).toList

  println(f(readInt).length)

}