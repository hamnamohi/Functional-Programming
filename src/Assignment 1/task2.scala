import scala.annotation.tailrec
object task2 {


  def CharArray(start: Int): List[Char] = {
    @tailrec
    def rec(ascii: Int, lst: List[Char]): List[Char] = {
      if (ascii > 122) {
        lst
      }
      else if (ascii >= 97 ){

        rec(ascii+1 , lst :+ ascii.toChar)
      }
      else{
        rec(97,lst)
      }

    }
    rec(start.toChar, Nil)
  }
def main(args : Array[String]) = {
  val charList = CharArray(97)
  println(charList)
}
}
