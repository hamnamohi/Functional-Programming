package Assignment2

object ex5 {
  def runCounter(): Unit =  {
    var count = 0
    val max = 10
    var finished = false

    case object Idle
    case object Counting
    case object Exit

    var state: Any = Idle
    while (true){
      state match{
      case Idle =>
        count = 0
        println(count)
        state = Counting
      case Counting =>
        if (count < max) {
          count += 1
          println(count)
        } else {
          state = Exit
        }
      case Exit =>
        finished = true
    }}}

    def main(args: Array[String]): Unit = {
      runCounter()
    }




}
