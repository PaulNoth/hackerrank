object GradingStudents extends App {
  val grades = Source.stdin.getLines().toList.tail.map(_.toInt)
  val finalGrades = grades.map(professorGradeRule)

  println(finalGrades.mkString("\n"))

  def professorGradeRule(grade: Int): Int = {
    val multiply5 = grade / 5
    val roundBy5 = if(grade % 5 == 0) multiply5 * 5 else (multiply5 + 1) * 5
    if(roundBy5 - grade < 3 && grade >= 38) roundBy5 else grade
  }
}
