# https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1#

'''
# Node Class:
class Node:
    def _init_(self,val):
        self.data = val
        self.left = None
        self.right = None
'''

#Function to return a list containing elements of left view of the binary tree.
def LeftView(root):
    
    # code here
    dict = {}
    
    leftviewtree(root, 1, dict)
    result = list(dict.values())
    return result

def leftviewtree(root, level, dict):
    if root is None:
        return
    
    if level not in dict:
        dict[level] = root.data
    
    leftviewtree(root.left, level + 1, dict)
    leftviewtree(root.right, level + 1, dict)

