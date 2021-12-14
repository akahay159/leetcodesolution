// https://leetcode.com/problems/max-consecutive-ones/


class Solution {
    
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var maxValue = 0
        var currentone = 0
        for(i in 0..nums.size - 1){
            if(nums[i] == 1){
                currentone++
                
            }else if(nums[i] == 0){
                currentone = 0
            }
            maxValue = Math.max(maxValue, currentone)
        }
        return maxValue
    }
}