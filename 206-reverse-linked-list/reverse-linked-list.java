/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        // Recursive Approach 
        // if(head == null || head.next == null ){
        //     return head;
        // }
        // ListNode newHead = reverseList(head.next);

        // head.next.next = head;
        // head.next = null;

        // return newHead;

        // Iterative Approach 

        if(head == null || head.next == null){
            return head;
        }

        ListNode prev = null;
        ListNode current = head;
       
        while(current != null){
          
          ListNode NextNode = current.next;

          current.next = prev;
          prev = current ;
          current = NextNode;
       

        }
        return prev;
    }
}