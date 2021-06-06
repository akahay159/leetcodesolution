// https://leetcode.com/problems/search-in-rotated-sorted-array/
class Solution {
    
    fun findNumber(array:IntArray, start : Int, end: Int, value : Int) : Int {
        if(start > end) return -1
        var mid = (start + end) / 2
        if(array[mid] == value) {
            return mid
        }
        if(array[start] <= array[mid]){
            if(value >= array[start] && value <= array[mid]){
                return findNumber(array, start, mid - 1, value )
            }
            return findNumber(array, mid+1,end, value)
        }
        if(value >= array[mid] && value <= array[end]){
            return findNumber(array, mid+1, end, value)
        }
        return findNumber(array, start, mid-1, value)
    }
    fun search(nums: IntArray, target: Int): Int {
        
        var n = nums.size
        var start = 0
        var end = n - 1
        val answer = findNumber(nums, start, end, target)
        return answer
        
    }
}
