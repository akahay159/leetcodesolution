# https://leetcode.com/problems/find-pivot-index/


class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        
        leftsum = 0
        rightsum = sum(nums)
        for i in range(len(nums)):
            if i > 0:
                leftsum += nums[i - 1]
            rightsum -= nums[i]
            if rightsum == leftsum:
                return i
        return -1
        