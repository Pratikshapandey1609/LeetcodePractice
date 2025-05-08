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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode>stack = new Stack<>();

        ListNode temp = head;
        while(temp != null){
            stack.push(temp);
            temp = temp.next;
        }

        ListNode newHead = stack.pop();
        int maxVal = newHead.val;

        while(!stack.isEmpty()){
           ListNode node = stack.pop();

           if(node.val < maxVal){
             continue;
           }
           else{
              node.next = newHead;
              newHead = node;
              maxVal = node.val;
           }
        }
        return newHead;
    }
}