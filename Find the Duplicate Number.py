# https://leetcode.com/problems/find-the-duplicate-number/

class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        
        for item in nums:
            if nums[abs(item) - 1] < 0:
                return abs(item)
            nums[abs(item) - 1] *= -1
        return -1
    
# Time -> O(N)
# Space -> O(1)
'''    
        helper = set()
        for item in nums:
            if item in helper:
                return item
            helper.add(item)
            
        return -1
    
    
  Time -> O(N)
  Space -> O(N)
 '''
