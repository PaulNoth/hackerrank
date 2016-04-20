def f(coefficients: List[Int], powers:List[Int], x: Double): Double =  {
  coefficients.indices.map(i => coefficients(i) * Math.pow(x, powers(i))).sum
}

def area(coefficients: List[Int], powers: List[Int], x: Double): Double = {
  scala.math.Pi * scala.math.pow(f(coefficients, powers, x), 2)
}

def summation(func: (List[Int], List[Int], Double) => Double,
              upperLimit: Int, lowerLimit: Int, coefficients: List[Int], powers: List[Int]): Double = {
  val range = lowerLimit.toDouble to upperLimit.toDouble by 0.001
  range.map(func(coefficients, powers, _)).sum * 0.001
}