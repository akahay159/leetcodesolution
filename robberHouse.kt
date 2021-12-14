class Solution {
    
     fun rob(nums: IntArray): Int {
        var n = nums.size
        var max_value = 0
        if(n == 0){
            return 0
        }
        if(n == 1){
            return nums[0]
        }
        var value1 = nums[0]
        var value2 = Math.max(nums[0], nums[1])
        
        if(n == 2){
            return value2
        }
        for(i in 2 until n){
            max_value = Math.max(nums[i] + value1, value2)
            value1 = value2
            value2 = max_value
        }
        return max_value
        
    }
}
//     fun solution(nums: IntArray, start: Int, end:Int): Int{
//         if(start > end){
//             return 0
//         }
//         if(start == end){
//             return nums[start]
//         }
//         if(start + 1 == end){
//             return Math.max(nums[start], nums[end])
//         }
        
//         return Math.max(nums[start] + solution(nums, start+2, end), solution(nums, start+1, end))
//     }
//     fun rob(nums: IntArray): Int {
//         var start = 0
//         var end = nums.size - 1
        
//         return solution(nums, start, end)
//     }
//}
