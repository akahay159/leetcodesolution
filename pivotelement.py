# https://leetcode.com/problems/find-pivot-index/

class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        
        ls = 0
        rs = 0
        for i in range(len(nums)):
            ls = sum(nums[:i])
            rs = sum(nums[i+1:])
            if rs == ls:
                return i
            ls = 0
            rs = 0
        return -1
    
        # leftsum = 0
        # rightsum = sum(nums)
        # for i in range(len(nums)):
        #     if i > 0:
        #         leftsum += nums[i - 1]
        #     rightsum -= nums[i]
        #     if rightsum == leftsum:
        #         return i
        # return -1
        
        
