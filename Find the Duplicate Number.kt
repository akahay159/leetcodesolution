
class Solution {
    fun findDuplicate(nums: IntArray): Int {
        
        // Solution 2. Time -> O(N) and Space -> O(1)
        for(item in nums){
            if((nums[Math.abs(item) - 1]) < 0){
                return Math.abs(item)
            }
            nums[Math.abs(item)-1] *= -1
        }
        return -1
        
        
        /*
        // Solution 1. Time -> O(N) and Space -> O(N)
        val helper = mutableSetOf<Int>()
        for(item in nums){
            if(item in helper){
                return item
            }
            helper.add(item)
        }
        return -1
        */
    }
}
