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
    var root: TreeNode?
    constructor(){
        this.root = root
    }
    fun countInternalNodes(root: TreeNode?): Int {
        if(root != null) {
            var result : Int = this.countInternalNodes(root.left) + this.countInternalNodes(root.right)
            if(root.left != null || root.right != null){
                return result + 1
            } else {
                return result
            }
            } else {
            return 0
        }
    }
}