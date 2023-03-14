package Assignment2

object ex1 {
  def solve(a: Int = 3, b: Int = 5, c: Int =7 )= {
    val x = List.range(-3,4)
    val eqn = x.map (x => a*x*x + b*x + c)
    eqn
  }

  def main(args: Array[String]) = {
    print(solve())
  }
}
