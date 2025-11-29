// 241RDB193 Kristofers Stūris




case class Node(var left: Tree, var value: Int, var right: Tree)


def pievienot(root: Node, value: Int): Node{
    if (root == null){
        Node(value)
    }else if ( value < root.value){
        root.left = pievienot(root.left, value)
        return root
    }else{
        root.right = pievienot(root.right, value)
        return root
    }
}


//testing
def inOrderTraversal(root: TreeNode): Unit = {
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

        
        
    }


    //testing
    var root: TreeNode = null

    val values = List(50, 30, 70, 20, 40, 60, 80)

    for (v <- values) {
        root = insert(root, v)
    }

    println("In-order Traversal of BST:")
    inOrderTraversal(root)


}



