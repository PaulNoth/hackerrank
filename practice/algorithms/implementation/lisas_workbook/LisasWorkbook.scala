import scala.io.Source

object LisasWorkbook extends App {
  val lines = Source.stdin.getLines().toList
  val line1 = lines.head
  val line2 = lines.tail.head

  val arr = line1.split(" ").map(_.toInt)
  val chapters = arr(0)
  val problemsPerPage = arr(1)
  val chapterProblems = line2.split(" ").map(_.toInt)

  val pages = chapterProblems.flatMap(problems => (1 to problems).grouped(problemsPerPage).map(_.toList)).toList
  val specialProblems = (1 to pages.length).count(pageNum => isPageWithSpecialProblem(pages(pageNum - 1), pageNum))
  println(specialProblems)

  def isPageWithSpecialProblem(page: List[Int], pageNum: Int): Boolean = {
    page.contains(pageNum)
  }
}
