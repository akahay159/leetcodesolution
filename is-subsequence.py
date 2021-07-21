# https://leetcode.com/problems/is-subsequence/

class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        sIdx = 0
        for item in t:
            if sIdx == len(s):
                return True
            if s[sIdx] == item:
                sIdx += 1
        return sIdx == len(s)
        # tIdx = 0
        # sIdx = 0
        # while tIdx < len(t) and sIdx < len(s):
        #     if s[sIdx] == t[tIdx]:
        #         sIdx += 1
        #     tIdx += 1
        # return sIdx == len(s)
      
# Time -> O(N)
# Space -> O(1)

