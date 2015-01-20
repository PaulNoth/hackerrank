package lambda_calculi9

/**
 * <p>
 * Calculi is Lambda's older brother. Lambda is mischievous and always annoys
 * Calculi by asking silly questions. This time around, Lambda would like to
 * surprise Calculi by asking a challenging and interesting question. To that
 * end, Lambda gives Calculi an array of <i>N</i> integers,
 * <i>A={a0,a1,...,aN−1}</i>, followed by <i>K</i> queries. Each query is of two
 * types:
 * </p>
 * <ul>
 * <li><i>Q l r</i>: Find the minimum positive integer, M, such that each
 * element in subarray arr[l…r] ({al,al+1,…,ar}) divides M.
 * <li><i>U idx val</i>: Multiply the value at idx by val. That is
 * a′idx=aidx×val, where a′idx is the updated value.
 * </ul>
 * <p>
 * Your task is to help Calculi tackle this challenge. For each query of type
 * <i>Q l r</i> find the value of M. As this value can be very large, print the
 * M modulo (10<sup>9</sup>+7), i.e., M%(10<i>9</i>+7). For query of type <i>U
 * idx val</i>, update the required element.
 * </p>
 * <p>
 * Input Format<br>
 * The first line contains an integer, N, which represents the length of array,
 * A. In second line, there are N space-separated integers, a0,a1,...,aN−1,
 * representing the elements of A. In third line, there is another integer, K,
 * which is the count of queries to follow. Then follows K lines, each
 * representing a query of one of the types described above.
 * </p>
 * <p>
 * Output Format <br>
 * For each query of type <i>Q l r</i>, print the value of M%(10<sup>9</sub>+7)
 * on a separate line.
 * </p>
 * <p>
 * Constraints<br>
 * 1<=N<=5×10<sup>4</sup><br>
 * 1<=ai<=100, where i∈[0,N−1]<br>
 * 1<=K<=5×10<sup>4</sup><br>
 * 0<=l<=r&lt;N<br>
 * 0<=idx&lt;N<br>
 * 1<=val<=100
 * </p>
 * 
 * @author Pidanic
 *
 */
object MinumumMultiple extends App {
  val lines = io.Source.stdin.getLines.toList
  //val lines = Iterator.continually(Console.readLine).takeWhile(_.nonEmpty).map(_.trim).toList
  val arraySize = lines(0).toInt
  var array = lines(1).split(" ").map(_.toLong).toArray
  val queriesSize = lines(2).toInt
  val queries = lines drop 3
  queries.foreach { query =>
    val q = query.split(" ")
    val command = query(0)
    if(command.toChar == 'Q') {
      println(arrayLcm(array, q(1).toInt, q(2).toInt))
    } else if(command.toChar == 'U') {
      updateArray(array, q(1).toInt, q(2).toInt)
    }
  }

  def gcd(a: Long, b: Long): Long = {
    if (b == 0) a else gcd(b, a % b)
  }

  def lcm(a: Long, b: Long): Long = {
    (a * b) / gcd(a, b)
  }

  def arrayLcm(arr: Array[Long], from: Int, toIndex: Int): Long = {
    var result:Long  = 1
    for(i <- from to toIndex)
      result = lcm(result, arr(i))
    result % 1000000007
  }

  def updateArray(arr: Array[Long], index:Int, value:Int):Unit = {
    arr(index) = arr(index) * value
  }
}