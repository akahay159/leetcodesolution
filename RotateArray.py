# https://leetcode.com/problems/rotate-array/

class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        def dorotate(nums, low, high):
            a = low
            b = high
        
            while(a < b):
                nums[a], nums[b] = nums[b], nums[a]
                a = a + 1
                b = b - 1
            
            
        n = len(nums)
        k = k % n
        dorotate(nums, n - k, n - 1)
        dorotate(nums, 0, n - k - 1)
        dorotate(nums, 0, n - 1)
        
  '''
  Time complexity -> O(n)
  Space Complexity -> O(1)
  '''
