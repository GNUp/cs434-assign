package recfun

object RecFun extends RecFunInterface {

  def main(args: Array[String]): Unit = {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(s"${pascal(col, row)} ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c-1, r-1) + pascal(c, r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balance_aux(chars: List[Char], mem: Int): Boolean = {
      if (chars.isEmpty) {
        mem == 0
      } else {
        val mem_tmp = if (chars.head == '(') mem + 1
                      else if (chars.head == ')') mem - 1
                      else mem
        if (mem_tmp < 0) false
        else balance_aux(chars.tail, mem_tmp)
      }
    }

    balance_aux(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
