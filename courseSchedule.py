'''
https://leetcode.com/problems/course-schedule

'''

class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        
        # make the adajancy graph
        graph = { i : [] for i in range(numCourses)}
        # make visited set
        visited = set()
        # now make the adajancy list and populate it 
        for node, edge in prerequisites:
            graph[node].append(edge)
        
        # now do the dfs call for adjancy list
        def dfs(course):
            if course in visited:
                return False
            if graph[course] == []:
                return True
            visited.add(course)
            
            for pre in graph[course]:
                if not dfs(pre):
                    return False
            visited.remove(course)
            graph[course] = []
            return True
        for node in range(numCourses):
            if not dfs(node):
                return False
        return True
        
            
        # below code is giving TLE
#         graph = collections.defaultdict(list)
#         visited = set()
#         for edge in prerequisites:
#             graph[edge[0]].append(edge[1])
        
#         def visit(vertex):
#             visited.add(vertex)
#             for neighbour in graph[vertex]:
#                 if neighbour in visited or visit(neighbour):
#                     return True
#             visited.remove(vertex)
#             return False
        
#         for nodes in range(numCourses):
#             if(visit(nodes)):
#                 return False
#         return True