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
    public ListNode removeElements(ListNode head, int val) {
        
        if(head == null){
            return head;
        }
        ListNode prev = new ListNode();
        prev.next = head; // creating new previous node which next is point to head and temp is pointing to prev which means travering is start from  head
        ListNode temp = prev;

        while(temp.next != null){

            if(temp.next.val == val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return prev.next;
    }
}