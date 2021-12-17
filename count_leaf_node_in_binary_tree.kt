class TreeNode{
    var data: Int
    var left : TreeNode?
    var right : TreeNode?
    constructor(data: Int){

        this.data = data
        this.left = null
        this.right = null
    }
}

class BinaryTree{
    var root : TreeNode?
    constructor(){
        this.root = null
    }
    fun countLeafNodes(node: TreeNode?): Int{
        if(node != null){
            var result : Int = this.countLeafNodes(root.left) + this.countLeafNodes(root.right)
            if(node.left == null && node.right == null){
                return result + 1
            }
            else {
                return result
            }
        }
        else{
            return 0
        }
    }
}