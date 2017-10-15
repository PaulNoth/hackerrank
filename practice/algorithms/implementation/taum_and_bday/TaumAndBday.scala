object TaumAndBday {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val t = sc.nextInt()
    var a0 = 0
    while(a0 < t){
      val black = sc.nextLong()
      val white = sc.nextLong()
      val x = sc.nextLong()
      val y = sc.nextLong()
      val z = sc.nextLong()

      val ansWithoutConvert = black * x + white * y
      val blackConvertCost = black * z
      val ansWhite = (white + black) * y + blackConvertCost

      val whiteConvertCost = white * z
      val ansBlack = (black + white) * x + whiteConvertCost

      var min = ansWithoutConvert
      if(ansBlack.compareTo(min) < 0)
      {
        min = ansBlack
      }
      if(ansWhite.compareTo(min) < 0)
      {
        min = ansWhite
      }
      println(min)
      a0 +=1
    }
  }
}
