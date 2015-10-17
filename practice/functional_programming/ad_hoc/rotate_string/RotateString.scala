object RotateString extends App {

   val lines = io.Source.stdin.getLines().toList
   val n = lines.head.toInt
   val strings = lines.tail

   strings.foreach(s =>
     println(rotations(s, 0).mkString(" "))
   )

   def rotate(s: String): String = {
     s.tail + s.head
   }

   def rotations(s: String, n: Int): List[String] = {
     if(n == s.length) Nil else rotate(s) :: rotations(rotate(s), n + 1)
   }
 }
