/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode root1, TreeNode root2) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        // adding roots in queue
        queue.add(root1);
        queue.add(root2);

        // loop till the queue is empty
        while(!queue.isEmpty()){
            TreeNode first  = queue.poll();
            TreeNode second = queue.poll();

            if(first == null && second == null){
                continue;
            }else if(first == null || second == null || first.val != second.val){
                return false;
            }

            queue.add(first.left);
            queue.add(second.left);
            queue.add(first.right);
            queue.add(second.right);

        }
        return true;
    }
}