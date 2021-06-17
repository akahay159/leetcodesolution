# https://leetcode.com/problems/single-number-ii

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        
        helper = {}
        for i in nums:
            if i not in helper:
                helper[i] = 1
            else:
                helper[i] += 1
        
        for key in helper.keys():
            if(helper[key] == 1):
                return key
