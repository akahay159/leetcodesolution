# https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/           

class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        
        
        helper = {}
        for index, value in enumerate(sorted(nums)):
            if value not in helper:
                helper[value] = index
        
        return [helper[value] for value in nums]
      
      
      
''' 
Time Complexity -> O(N)
Space Complexity -> O(N)
Runtime: 52 ms, faster than 90.51%
'''
