// https://leetcode.com/problems/sort-colors/

class Solution {
    fun sortColors(nums: IntArray): Unit { 
        var mid = 0 
        var low = 0
        var high = (nums.size) - 1
        
        while(mid <= high){
            if(nums[mid] == 2){
                //logic for swapping a number
                // a = b.also { b = a }
                nums[mid] = nums[high].also {nums[high] = nums[mid]}
                --high
            } else if(nums[mid] == 0){
                nums[mid] = nums[low].also {nums[low] = nums[mid]}
                ++low
                ++mid
            } else{
                ++mid
            }
        }       
    }
}
