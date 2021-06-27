// https://leetcode.com/problems/rotate-array/


class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        val originalArray = nums.copyOf()
        for (i in nums.indices) {
            val j = (i + k) % nums.size
            nums[j] = originalArray[i]
        }
    }
}


/* 
Time Complexity -> O(n)
Space Complexity -> O(n) 
 */

//-----------------------------------------------------------------------

/* 
Time Complexity -> O(n)
Space Complexity -> O(1) 
 */
class Solution {
    fun dorotate(nums:IntArray, low: Int, high: Int): Unit {
        var a = low
        var b = high
        while(a < b){
            nums[a] = nums[b].also{nums[b] = nums[a]}
            a++
            b--
        }
    }
    
    fun rotate(nums: IntArray, k: Int): Unit {
            val tempk = k % nums.size
            val n = nums.size
            dorotate(nums, n - tempk, n - 1)
            dorotate(nums, 0, n - tempk - 1)
            dorotate(nums, 0, n - 1)
                
        }
    }

