// https://leetcode.com/problems/validate-binary-search-tree
/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun isValidBST(root: TreeNode?): Boolean {
        return (isBSTUtil(root, Int.MIN_VALUE, Int.MAX_VALUE))    
        
    }
    fun isBSTUtil(root:TreeNode?, min: Int, max: Int): Boolean{
        if (root == null){
            return true
        }
        if (root.`val` < min || root.`val`> max){
            return false
        }
        return (isBSTUtil(root.left, min, root.`val`-1) && isBSTUtil(root.right, root.`val`+1, max))
    }
}
