// https://leetcode.com/problems/palindrome-linked-list/

class Solution {
    fun isPalindrome(head: ListNode?): Boolean {
        if(head == null) return true
        var mylist : MutableList<Int> = mutableListOf<Int>()
        
        var temphead = head
        while(temphead != null){
            mylist.add(temphead.`val`)
            temphead = temphead.next
        }
        
        for(i in 0..(mylist.count()/2)){
            if(mylist[i] != mylist[mylist.count() - 1 -i])
                    return false
        }
        return true        
        
    }
}
