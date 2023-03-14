package Assignment2

object ex2 {
  def solve(a: Int = 3, b: Int = 5, c: Int = 7) = {
    val x = List.range(-3, 4)
    val eqn = x.map(x => a * x * x + b * x + c)
    val lst = x.zip(eqn)
    val indexedlst = lst.zipWithIndex.map { case ((a,b),c) => (a,b,c) }
    println(indexedlst)
    val m = eqn.sum / eqn.length
//    println(eqn.sum)
    val mean = List(m,eqn.length)
    mean
  }


  def main(args: Array[String]) = {
    println(solve())
  }

}
