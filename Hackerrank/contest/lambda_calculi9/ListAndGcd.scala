package lambda_calculi9

import scala.collection.Iterator
import scala.collection.immutable.List

/**
 * <p>
 * <b>Problem Statement</b><br/>
 * We call an integer p>1 a prime number (or simply a prime) if its only
 * positive divisors are 1 and p. <br/>
 * <i>Fundamental theorem of arithmetic states</i>: Every positive integer n can
 * be uniquely expressed as a product of power of primes, i.e.,
 * 
 * N=p<sub>1</sub><sup>n<sub>1</sub></sup> x
 * p<sub>2</sub><sup>n<sub>2</sub></sup> x p<sub>3</sub><sup>n<sub>3</sub></sup>
 * <br/>
 * where, p<sub>i</sub> is the ith prime, i.e.,
 * p<sub>1</sub>=2,p<sub>2</sub>=3,p<sub>3</sub>=5,... ∀i.ni≥0
 * </p>
 * <p>
 * <b>Greatest common divisor of two positive integers</b> <br/>
 * For two positive integers, A and B, whose prime factorization is represented
 * as <br/>
 * <br/>
 * A = p<sub>1</sub><sup>a<sub>1</sub></sup> x
 * p<sub>2</sub><sup>a<sub>2</sub></sup> x p<sub>3</sub><sup>a<sub>3</sub></sup>
 * x ... <br/>
 * A = p<sub>1</sub><sup>b<sub>1</sub></sup> x
 * p<sub>2</sub><sup>b<sub>2</sub></sup> x p<sub>3</sub><sup>b<sub>3</sub></sup>
 * x ... <br/>
 * We calculate the greatest common divisor, gcd(A,B), as <br/>
 * gcd(A,B) = p<sub>1</sub><sup>min(a<sub>1</sub>,b<sub>1</sub>)</sup> x
 * p<sub>2</sub><sup>min(a<sub>2</sub>,b<sub>2</sub>)</sup> x
 * p<sub>3</sub><sup>min(a<sub>3</sub>,b<sub>3</sub>)</sup> x ...
 * </p>
 * <p>
 * <b>Greater common divisor of a list of numbers</b> <br/>
 * Greatest common factor of a list of positive integers,
 * lst={l<sub>1</sub>,l<sub>2</sub>,...,l<sub>q</sub>}, is represented as <br/>
 * 
 * gcd(lst)=gcd(l<sub>1</sub>,gcd(l<sub>2</sub>,gcd(l<sub>3</sub>,...,(gcd(l<sub
 * >q−1</sub>,l<sub>q</sub>))...)))
 * </p>
 * <p>
 * <b>Finite representation of prime factorization</b> <br/>
 * Since primes are infinite, it is not possible to store factors in the form
 * provided above. To that end, we will only consider those prime factors
 * (p<sub>i</sub>) whose power is greater than zero (n<sub>i</sub>>0). That is:
 * <br/>
 * N=p<sub>i<sub>1</sub></sub><sup>n<sub>i<sub>1</sub></sub></sup> x
 * p<sub>i<sub>2</sub></sub><sup>n<sub>i<sub>2</sub></sub></sup> x
 * p<sub>i<sub>3</sub></sub><sup>n<sub>i<sub>3</sub></sub></sup> x ... <br/>
 * , where<br/>
 * 
 * pij<pij+1 0<nij, j in [1,2,...]; for rest ni=0 And we will represent them as
 * following:
 * 
 * N=p<sub>i<sub>1</sub></sub> n<sub>i<sub>1</sub></sub>
 * p<sub>i<sub>2</sub></sub> n<sub>i<sub>2</sub></sub> p<sub>i<sub>3</sub></sub>
 * n<sub>i<sub>3</sub></sub> <br/>
 * For example: <br/>
 * 49=7<sup>2</sup>=7 2<br/>
 * 28=2<sup>2</sup>×7<sup>1</sup>=2 2 7 1
 * </p>
 * <p>
 * <b>Challenge</b><br/>
 * 
 * You are given the elements of list, lst, in the representation provided
 * above. Find its greatest common divisor, i.e., gcd(lst).
 * </p>
 * <p>
 * Input Format<br/>
 * 
 * First line contains an integer, q, which is the size of list, lst. Then
 * follows q lines, where ith line represents the factors of ith element of lst,
 * l<sub>i</sub>
 * </p>
 * <p>
 * Output Format<br/>
 * 
 * Print one line representing the greatest common divisor of lst (gcd(lst)) in
 * the above representation.
 * </p>
 * <p>
 * Constraints <br/>
 * 2<=q<=1000 <br/>
 * All other integers lie in [1,10<sup>5</sup>]<br/>
 * 1<= Total number of prime factors * of an element <=100
 * </p>
 * <p>
 * Sample Input #00 <br/>
 * 2 <br/>
 * 7 2 <br/>
 * 2 2 7 1
 * </p>
 * <p>
 * Sample Output #00 <br/>
 * 7 1
 * </p>
 * 
 * @author Pidanic
 * 
 */
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