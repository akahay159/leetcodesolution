// https://leetcode.com/problems/path-sum/
// Time -> O(N)
// Space -> O(N)

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
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if(root == null) {
            return false
        }
        val cnt = targetSum - root!!.`val`
        if(root?.left == null && root?.right == null){
            return cnt == 0
        }
        return hasPathSum(root?.left, cnt) || hasPathSum(root?.right, cnt)
        
    }
}

