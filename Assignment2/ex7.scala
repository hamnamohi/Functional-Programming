package Assignment2

object ex7 {
  def ex7()={
    val seq = Seq(1, 2, 3, 4, 5)
    val seq_ = seq.map(_ * 2)
    val seq_1 = seq.flatMap(x => Set(x * x))
    println(seq_)
    println(seq_1)

    val set = Set(1,2,3,4,5)
    val set_ = seq.map(_ * 2)
    val set_1 = set.flatMap(x => Set(x * x))
    println(set_)
    println(set_1)

    val vector = Vector(1, 2, 3, 4, 5)
    val doubledVector = vector.map(_ * 2)
    val squaredVector = vector.flatMap(x => Vector(x * x))
    println(doubledVector)
    println(squaredVector)


  }

  def main(args: Array[String]) = {
    ex7()
  }
}
