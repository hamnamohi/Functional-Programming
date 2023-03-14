package Assignment2
object ex12 {
  def add(p1: Any, p2: Any) ={
    val result = p1.toString() + p2.toString()
    println(result)
  }

  def main(args: Array[String]) = {
    add(3,4)
  }
}
