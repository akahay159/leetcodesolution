// https://leetcode.com/problems/find-peak-element

class Solution {
    
//     fun getResultRecursive(nums:IntArray, start: Int, end: Int, n:Int): Int{
        
//         // // base case 
//         // var mid = (start+end)/2
//         // if((mid == 0 || (nums[mid] > nums[mid - 1])) && (mid == n-1 || (nums[mid] > nums[mid + 1]))){
//         //     return mid
//         // } else if(nums[mid] < nums[mid + 1]){
//         //     return getResult(nums, mid+1, end, n)
//         // } else {
//         //     return getResult(nums, 0, mid-1,n)
//         // }
        
        
//     }
    // recursive approach ends
    fun findPeakElement(nums: IntArray): Int {
        // iterative approach starts 
        var start = 0
        var end = nums.size - 1
        while(start < end){
            var mid = (start + end) / 2
            if(nums[mid] > nums[mid + 1]){
                end = mid
            } else {
                start = mid + 1
            }
        }
        return start
        // iterative approach ends
        // recursive approach starts
        //return (getResultRecursive(nums, 0, nums.size - 1, nums.size))
    }
}

