import scala.collection.mutable
object ex2 {
  def e2() = {
    var m= Map("Name" -> "Hamna")
    m += ("Age" -> "19")
    println(m)

    val m2 = mutable.Map("Name" -> "Hamna")
    m2 += ("Age" -> "19")
    println(m2)

    var m3 = Set(1, 2, 3)
    m3 +=(4)
    println(m3)

    val m4 = mutable.Set(1, 2, 3)
    m4.add(4)
    println(m4)
}
  def main(args: Array[String]) = {
    e2()
  }}
