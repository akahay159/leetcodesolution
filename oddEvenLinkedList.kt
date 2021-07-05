// https://leetcode.com/problems/odd-even-linked-list/


/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun oddEvenList(head: ListNode?): ListNode? {
        
        if(head == null || head.next == null)
        return head
        
        var even = head.next
        var evenHead = even
         
        var odd = head
        
        while(odd?.next != null && even?.next != null){
            odd?.next = even?.next
            odd = odd?.next
            even?.next = odd?.next
            even = even?.next
            
        }
        odd?.next = evenHead
        return head
        
    }
}


// Time Complexity - O(n)
// Space Complexity - O(1)
