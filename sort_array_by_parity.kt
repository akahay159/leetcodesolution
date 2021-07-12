// https://leetcode.com/problems/sort-array-by-parity/

class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        
        var left = 0
        var right = nums.size - 1
        while(right > left) {
            if(nums[left] % 2 != 0){
                nums[left] = nums[right].also {nums[right] = nums[left]}
                right--
            } else {
                left++
            }
        }
        return nums
        
    }
}

/*
Time -> O(n)
Space -> O(1)
*/
