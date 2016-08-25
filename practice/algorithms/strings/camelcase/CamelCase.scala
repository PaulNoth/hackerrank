object CamelCase {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val s = sc.next()
    println(s.split("[A-Z]").length)
  }
}
