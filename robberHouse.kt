// https://leetcode.com/problems/house-robber

class Solution {
    fun solution(nums: IntArray, start: Int, end:Int): Int{
        if(start > end){
            return 0
        }
        if(start == end){
            return nums[start]
        }
        if(start + 1 == end){
            return Math.max(nums[start], nums[end])
        }
        
        return Math.max(nums[start] + solution(nums, start+2, end), solution(nums, start+1, end))
    }
    fun rob(nums: IntArray): Int {
        var start = 0
        var end = nums.size - 1
        
        return solution(nums, start, end)
    }
}