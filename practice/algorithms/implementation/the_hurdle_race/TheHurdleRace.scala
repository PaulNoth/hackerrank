object TheHurdleRace extends App {
  val sc = new java.util.Scanner (System.in)
  val n = sc.nextInt()
  val k = sc.nextInt()
  var height = new Array[Int](n)
  for(height_i <- 0 until n) {
    height(height_i) = sc.nextInt()
  }

  val maxHeight = height.max
  val beverages = if(maxHeight > k) maxHeight - k else 0

  println(beverages)
}
