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
    int MaxSum = Integer.MIN_VALUE;
    // method 
    public int DFS(TreeNode root){
    
        if(root == null){
            return 0;
        }
        int left  = Math.max(DFS(root.left), 0);
        int right = Math.max(DFS(root.right), 0);

        int TotalSum  = root.val + left + right;

        MaxSum = Math.max(MaxSum ,  TotalSum);

        return root.val + Math.max(left , right);
    }
      public int maxPathSum(TreeNode root) {
        DFS(root);
        return MaxSum; 
    }
}