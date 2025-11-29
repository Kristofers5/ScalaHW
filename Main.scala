// 241RDB193 Kristofers Stūris


def factor(n: Int): Unit = {

    @annotation.tailrec
    def helper(n: Int, factor: Int): Unit = {
        if ( factor > n ){
            return
        }

        if ( n % factor == 0) {
            printf("%d ", factor)
            helper(math.floor(n / factor).toInt, factor)
        }else{
            helper(n, factor + 1)
        }
    }

    helper(n, 2)
}




object Main {

    def main(args: Array[String]): Unit = {

        printf("n = ")
        var n = scala.io.StdIn.readInt()

        if (n < 2) {
            printf("error")

        }else{
            factor(n)
        }
        println("")
        
    }
}