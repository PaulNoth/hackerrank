package lambda_calculi9

/**
 * <p>
 * George is very concerned about the stock options his company has granted him,
 * because the company's stock price has fluctuated unpredictably and has often
 * failed to meet expectations. With this in mind, George has decided to sell
 * his options. Before doing so, he would like to perform a series of
 * calculations.
 * </p>
 * <p>
 * Stock price history is presented as an array of positive integers,
 * A={a0,a1,...,an−1}, which represents the average price per day of that stock.
 * For a given day d (0≤d&lt;n) and margin M, George needs to find the longest
 * subarray containing the day's entry as a minimum, ad, and all other entries
 * not exceeding ad+M.
 * </p>
 * <p>
 * That is, he has to find the longest subarray, A[l,r]={al,al+1,…,ar}, such
 * that<br>
 * <ul>
 * <li>0<=l<=d<=r<=n<br>
 * <li>ad=minimum{A[l,r]}<br>
 * <li>∀i∈[l,r],ad≤ai≤ad+M<br>
 * </ul>
 * George asks you to help him solve this problem.
 * </p>
 * <p>
 * Input Format<br>
 * The first list contains an integer n which represents the length of the array
 * A. The second line contains n space-separated integers, a0,a1,…,an−1, which
 * represent the element of array A. The next line contains the number of
 * queries Q. Each of the subsequent Q lines contain two integers d and M which
 * represent the index of the element, which should be minimal and be included
 * in subarray, and margin, respectively.
 * </p>
 * <p>
 * Output Format<br>
 * For each query output the length of the longest subarray with the required
 * properties.
 * </p> 
 * <p>
 * Constraints<br>
 * <ul><li>1≤n≤5e10<sup>4</sup>
 * <li>1≤A[i]≤10<sup>9</sup>,
 * <li>0≤i<n
 * <li>1≤Q≤10<sup>5</sup>
 * <li>0≤d&lt;n
 * <li>0≤M≤109
 * </ul>
 * </p>
 * <p>
 * Sample Input<br>
 * 5<br>
 * 3 5 2 6 1<br>
 * 2<br>
 * 0 2<br>
 * 2 3
 * </p>
 * <p>Sample Output <br>
 * 2 3 
 * </p>
 * <p>
 * Explanation<br>
 * Query #1: The first element, a0=3, should be included in the subarray. Since
 * a1=5 is not less than 3 and does not cross the margin (3+2=5), it can be
 * included. The third element, a2=2, is less than the first element, so it
 * cannot be included. To that end, the answer here is 2, as the longest
 * subarray will be A[0,1].
 * <br><br>
 * Query #2: Here d=2 and ad=2. The next element, a3=6, is excluded because it
 * is greater than the margin, 2+3=5. All of the previous elements will be
 * included, as they are within the allowed range [2,5]. To that end, the
 * longest subarray will be A[0,2] and have a length of 3.
 * </p>
 * 
 * @author Pidanic
 * 
 */
object StockPediction extends App{

  val lines = io.Source.stdin.getLines.toList
  //val lines = Iterator.continually(Console.readLine).takeWhile(_.nonEmpty).map(_.trim).toList
  val arrayLength = lines(0).toInt
  val array = lines(1).split(" ").map(_.toInt)
  val queriesLength = lines(2).toInt
  val queries = lines.drop(3)
  queries.foreach {
    query =>
      val a = query.split(" ").map(_.toInt)
      val d = a(0)
      val margin = a(1)
//      array.take
      println(array.drop(array.indexWhere(_ >= array(d))).takeWhile(stock(_, array(d), margin)).length)
  }

  def stock(a: Int, d: Int, margin: Int): Boolean =
    a >= d && a <= d + margin
}