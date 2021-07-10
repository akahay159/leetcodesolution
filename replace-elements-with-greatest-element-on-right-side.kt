// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side


class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        var length_of_array = arr.size
        var max_so_far = arr[length_of_array - 1]
        arr[length_of_array - 1] = -1
        
        for(i in length_of_array - 2 downTo 0) {
            var temp = arr[i]
            arr[i] = max_so_far
            if(temp > max_so_far){
                max_so_far = temp
            }
        }
        return arr
        
    }
}

/*
Time Complexity -> O(n)
Space Complexity -> O(1)
*/
