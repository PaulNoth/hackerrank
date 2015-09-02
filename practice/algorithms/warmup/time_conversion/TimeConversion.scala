object TimeConversion extends App {
  val line = io.Source.stdin.bufferedReader().readLine()

  val hours = line.substring(0, line indexOf ':').toInt
  val minutes = line.substring((line indexOf ':') + 1, line lastIndexOf ':').toInt
  val seconds = line.substring((line lastIndexOf ':') + 1, (line lastIndexOf ':') + 3).toInt

  val newHours = if (hours == 12) 0 else hours
  val shift = if(line.toLowerCase contains "pm") 12 else 0
  println("%02d:%02d:%02d".format((newHours + shift), minutes, seconds))
}
