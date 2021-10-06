# https://leetcode.com/problems/unique-paths

class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        # Problem Accepted  
        helper = [[0] * n] * m
        for i in range(m):
            helper[i][0] = 1
        for j in range(n):
            helper[0][j] = 1
        
        for i in range(1, m):
            for j in range(1, n):
                helper[i][j] = helper[i - 1][j] + helper[i][j - 1]
                
        return helper[-1][-1]
        # It will give TLE

#         if n == 1 or m == 1:
#             return 1
        
#         path = self.uniquePaths(m - 1, n) + self.uniquePaths(m, n - 1)
        
#         return path
        