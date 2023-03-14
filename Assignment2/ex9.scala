package Assignment2

object ex9 {
  def apply(list: List[Int]): Unit = {
    var sum = 0
    for (element <- list) {
      sum += element
    }
    println(sum)
  }
  def apply_(list: List[Int]) ={
    val sum = list.reduce(_ + _)
    println(sum)
  }

  def main(args: Array[String]) = {
    val lst= List(1,2,3,4,5)
    apply(lst)
    apply_(lst)
  }
}
