package Assignment2
object ex11 {
    implicit def intToString(x: Int): String = x.toString

    def printString(s: String): Unit = println(s)

  def main(args: Array[String]) = {
    printString(42)
  }
}
