object BeautifulBinaryString {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val n = sc.nextInt()
    val B = sc.next()

    val beautiful = B.replaceAll("010", "b")
    val changes = beautiful.count(_ == 'b')
    println(changes)
  }
}
