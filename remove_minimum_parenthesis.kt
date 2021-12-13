// https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses

class Solution {
    fun minRemoveToMakeValid(s: String): String {
        var stack = Stack<Int>()
        var helperArray = s.toCharArray()
        var helpersize = helperArray.size
        for(i in 0..helpersize-1){
            if(helperArray[i] == '('){
                stack.push(i)
            }else if(helperArray[i] == ')'){
                if(stack.size == 0){
                    helperArray[i] ='.'
                } else{
                    stack.pop()
                }

            }
        } 
        while(!stack.empty()){
            helperArray[stack.pop()] ='.'
        }
        
        var st = StringBuilder()
        for(i in helperArray){
            if(i != '.'){
                st.append(i)
            }
        }
        
        return st.toString()
        
    }
}