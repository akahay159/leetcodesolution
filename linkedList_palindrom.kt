
// https://leetcode.com/problems/palindrome-linked-list


/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */


/*
Solution 1 : Time -> O(N)
             Space -> O(N)
*/
// class Solution {
//     fun isPalindrome(head: ListNode?): Boolean {
//         if(head == null) return true
//         var mylist : MutableList<Int> = mutableListOf<Int>()
        
//         var temphead = head
//         while(temphead != null){
//             mylist.add(temphead.`val`)
//             temphead = temphead.next
//         }
        
//         for(i in 0..(mylist.count()/2)){
//             if(mylist[i] != mylist[mylist.count() - 1 -i])
//                     return false
//         }
//         return true        
        
//     }
// }

/*
Solution 2 : Time -> O(N)
             Space -> O(1)
*/
class Solution {
    
    private fun reverse(head: ListNode?): ListNode?{
        var previous: ListNode? = null
        var helper = head
        while(helper != null){
            var nextNode = helper.next
            helper.next = previous
            previous = helper
            helper = nextNode
        }
        return previous
    }
    fun isPalindrome(head: ListNode?): Boolean {
        if(head == null || head.next == null){
            return true
        }
        var helper = head
        // find the middle of the linkedlist
        var slow : ListNode? = head
        var fast : ListNode?  = head
        while(fast != null && fast.next != null){
            slow = slow!!.next
            fast = fast!!.next!!.next
        }
        var secondHead : ListNode? = reverse(slow)
        var cpysecondHead : ListNode? = secondHead
        // check for the palindrome
        while(helper != null && secondHead != null){
            if(helper.`val` != secondHead.`val`){
                break
            }
            helper = helper!!.next
            secondHead = secondHead!!.next
        }
            reverse(cpysecondHead)
            if(helper == null || secondHead == null)
            return true
            
        
        
        return false
    }
}