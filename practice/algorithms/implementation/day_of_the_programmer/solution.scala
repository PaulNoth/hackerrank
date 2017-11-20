object solution extends App {
  val sc = new java.util.Scanner (System.in)

  val year = sc.nextInt
  val output = if (year == 1918)
    "26.09.1918"
  else if (((year <= 1917) && (year%4 == 0)) || ((year%400 == 0) || ((year%4 ==0) & (year%100 != 0))))
    "12.09." + year
  else
    "13.09." + year

  println(output)
}
