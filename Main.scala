// 241RDB193 Kristofers Stūris




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


//testing
def inOrderTraversal(root: Node): Unit = {
    if (root != null) {
        inOrderTraversal(root.left)
        print(root.value + " ")
        inOrderTraversal(root.right)
    }
}




object Main {

    def main(args: Array[String]): Unit = {

        printf("n = ")
        var n = scala.io.StdIn.readInt()

        var input = scala.io.StdIn.readLine()
        var num = input.split(" ")

        var root: Node = null

        for ( i <- 0 until n ) {
            root = pievienot(root, num(i).toInt)
        }

        println("In-order Traversal of BST:")
        inOrderTraversal(root)



    }
}



