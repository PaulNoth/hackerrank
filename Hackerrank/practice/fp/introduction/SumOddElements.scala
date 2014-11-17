package fp.introduction

/**
 * Return sum of odd elements from an list. The input and output portions will be handled automatically. 
 * You need to write a function with the recommended method signature.
 * 
 * @author Pidanic
 * 
 */
object SumOddElements extends App{
   def f(arr:List[Int]):Int = arr.filter(_ % 2 != 0).sum
}