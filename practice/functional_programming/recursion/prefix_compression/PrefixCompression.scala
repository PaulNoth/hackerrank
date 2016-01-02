object PrefixCompression extends App {
  
  val lines = io.Source.stdin.getLines.toArray
  val a = lines(0)
  val b = lines(1)
  val prefix = commonPrefix(a, b, 0)
  
  println(prefix + " " + a.substring(0, prefix))
  println((a.length - prefix) + " " + a.substring(prefix))
  println((b.length - prefix) + " " + b.substring(prefix))
  
  private def commonPrefix(a : String, b: String, index: Int): Int = 
  {
    if(index < 0)
    {
      return 0
    }
    if(index == a.length)
    {
      return index
    }
    if(index == b.length)
    {
      return index
    }
    if(a.charAt(index) == b.charAt(index))
    {
      return commonPrefix(a, b, index + 1)
    }
    return index
  }
}