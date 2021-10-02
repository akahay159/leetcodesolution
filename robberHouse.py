class Solution:
     # brute force approach -> give TLE
     # use dp for not getting TLE
    
    def solution(self,nums: List[int], n : int, dp: List[int]):
            # if n is lesss than zero\
            if(n < 0):
                return 0
            # if n is zero then return the current values
            if(n == 0):
                dp[n] = nums[n]
                return dp[n]
            
            if(n == 1):
                dp[n] = max(nums[n], nums[n-1])
                return dp[n]
            
            if(dp[n] != -1):
                return dp[n]
            
            # if the current values is taken
            
            
            x = nums[n] + self.solution(nums, n - 2, dp)
            
            # if the current values is not taken
            y = self.solution(nums, n - 1,dp)
            
            dp[n] = max(x,y)
            return dp[n]
        
    def rob(self, nums: List[int]) -> int:
        
        dp = [-1] * (len(nums))
        self.solution(nums, len(nums) - 1, dp)
        return dp[len(nums)-1]
            
        
        