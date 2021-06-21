//https://leetcode.com/problems/missing-number/

class Solution {
    fun missingNumber(nums: IntArray): Int {
        
        var res = 0
        for(item in 0..nums.size-1){
            res = res xor item
            res = res xor nums[item]
        
        }
        return (res xor nums.size)        
    }
}
