// https://leetcode.com/problems/valid-triangle-number/

class Solution {
    fun triangleNumber(nums: IntArray): Int {
        nums.sort()
        val n = nums.size
        var i : Int = 0
        var j : Int = i
        var k : Int = 0
        var count = 0
        for(i in 0..n-2){
            for (j in i+1.. n){
                k = j + 1
                while(k < n && nums[i]+ nums[j] > nums[k]){
                    k = k + 1
                }
                count = count + (k - 1) - j
            }
        }
        return count
    }
}
