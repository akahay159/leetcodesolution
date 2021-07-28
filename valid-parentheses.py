
def match(a,b):
    if a == '(' and b == ')':
        return 1
    if a == '[' and b == ']':
        return 1
    if a == '{' and b == '}':
        return 1
    return 0
class Solution:   
    def isValid(self, s: str) -> bool:
        # Solution 1 -> Time -> O(N) and Space -> O(N)
        helper = []
        for i in range(len(s)):
            if (s[i] == '(' or s[i] == '[' or s[i] == '{'):
                helper.append(s[i])
            if (s[i] == ')' or s[i] == ']' or s[i] == '}'):
                if helper == [] :
                    return False
                else :
                    temp = helper.pop()
                    if(match(temp, s[i]) != 1):
                        return False
                    
        return len(helper) == 0
                
        
        
        # Solution 2 - > Same but the execution time is less
        
#         openBrackets = "({["
#         closeBrackets = ")}]"
        
#         checkforcases = {')':'(', '}':'{',']':'['}
#         stack = []
#         for brackets in s:
#             if brackets in openBrackets:
#                 stack.append(brackets)
#             elif brackets in closeBrackets:
#                 if len(stack) == 0:
#                     return False
#                 if stack[-1] == checkforcases[brackets]:
#                     stack.pop()
#                 else:
#                     return False
                
#         return len(stack) == 0
                
                
                
