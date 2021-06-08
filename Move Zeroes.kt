// https://leetcode.com/problems/move-zeroes/

class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        
        var cnt = 0
        var n = nums.size
        for(i in nums.indices){
            if(nums[i] != 0){
                nums[cnt++] = nums[i]
            }
        }
        while(cnt < n){
            nums[cnt++] = 0
        }
        
    }
}
