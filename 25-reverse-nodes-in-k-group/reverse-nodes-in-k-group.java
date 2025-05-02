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
    public ListNode reverseKGroup(ListNode head, int k) {
        
       if(head == null || k == 1){
        return head;
       }
       
       ListNode current = head;
       ListNode prev = null;

       while(true){
           ListNode check = current;
           int count = 0;

           // check if there are k nodes
           while(check != null && count < k){
            check = check.next;
            count++;
           }
           if(count < k) break;

           ListNode last = prev;
           ListNode newEnd = current;

         // reverse list 
           for(int i = 0; current != null  && i < k ; i++){
            ListNode nextNode = current.next;

             current.next = prev;
             prev = current;
             current = nextNode;

            //  if(nextNode != null){
            //     nextNode = nextNode.next;
            //  }
           }

          // connect with previous part 
          if(last != null){
            last.next = prev;
          }else{
            head = prev;
          }

          newEnd.next = current;
          prev = newEnd;

       }
       return head;
    }
}