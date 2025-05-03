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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];

        // Step 1: Find the length of the linked list
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        // Step 2: Determine basic parts and extra nodes
        int eachNode = length / k;
        int extraNode = length % k;

        // Step 3: Split the list into k parts
        current = head;
        for (int i = 0; i < k; i++) {
            ans[i] = current; 
            int partSize = eachNode + (extraNode > 0 ? 1 : 0);
            extraNode--; 
            
            ListNode prev = null;
            for (int j = 0; j < partSize; j++) {
                if (current != null) {
                    prev = current;
                    current = current.next;
                }
            }
            if (prev != null) {
                prev.next = null;
            }
        }
        
        return ans;
    }
}
