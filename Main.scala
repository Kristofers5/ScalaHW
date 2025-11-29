// 241RDB193 Kristofers Stūris



import scala.collection.mutable.Stack


case class Node(var value: Int, var left: Node = null, var right: Node = null)


def pievienot(root: Node, value: Int): Node = {
    if (root == null){
        return Node(value)
    }else if ( value < root.value){
        root.left = pievienot(root.left, value)
        return root
    }else{
        root.right = pievienot(root.right, value)
        return root
    }
}


def mekle( root: Node, x: Int ): Unit = {

    val stack = Stack[String]()
    stack.push("*")

    def helper( root: Node, x: Int ): Unit = {
        if ( root == null ) {
            println("not found")
        }else if ( x < root.value ){
            stack.push("L")
            helper( root.left, x )
        }else if ( x > root.value){
            stack.push("R")
            helper( root.right, x )    
        }else if ( x == root.value){
            val temp = Stack[String]()
            while ( stack.nonEmpty ) {
                temp.push(stack.pop())
            }
            
            while ( temp.nonEmpty ){
                printf( temp.pop )
            }
            println("")
        }
    }

    helper(root, x)
}


object Main {

    def main(args: Array[String]): Unit = {

        printf( "n = " )
        var n = scala.io.StdIn.readInt()

        var input = scala.io.StdIn.readLine()
        var num = input.split(" ")

        var root: Node = null

        for ( i <- 0 until n ) {
            root = pievienot(root, num(i).toInt)
        }

        printf( "x = " )
        var x = scala.io.StdIn.readInt()


        println("result: ")
        mekle(root, x)
    }
}