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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        int group = 1; 
        ListNode curr = head;
        ListNode prev = null; 

        while (curr != null) {
            int count = 0;
            ListNode temp = curr;

            
            while (temp != null && count < group) {
                temp = temp.next;
                count++;
            }

            if (count % 2 == 0) {
                curr = reverse(prev, curr, count);
            }

            while (count-- > 0 && curr != null) {
                prev = curr;
                curr = curr.next;
            }

            group++;
        }
        return head;
    }

    private ListNode reverse(ListNode prev, ListNode headGroup, int n) {
        ListNode prevNode = null, curr = headGroup, next;
        while (curr != null && n-- > 0) {
            next = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = next;
        }

        headGroup.next = curr; 
        if (prev != null) prev.next = prevNode; 

        return prevNode; 
    }
}
