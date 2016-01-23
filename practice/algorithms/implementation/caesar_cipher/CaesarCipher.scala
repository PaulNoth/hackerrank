import scala.io.Source

object CaesarCipher extends App {
  val lines = Source.stdin.getLines().toList
  val text = lines(1)
  val encryptionKey = lines(2).toInt
  val encrypted = text.map(caesarCipher(_, encryptionKey))
  println(encrypted)

  def caesarCipher(c: Char, shift: Int): Char = {
    if(c >= 'a' && c <= 'z') {
      return ((c.toInt - 'a'.toInt + shift) % 26 + 'a'.toInt).toChar
    }
    if(c>= 'A' && c <= 'Z') {
      return ((c.toInt - 'A'.toInt + shift) % 26 + 'A'.toInt).toChar
    }
    return c
  }
}