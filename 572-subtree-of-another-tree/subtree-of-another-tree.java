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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
      if(root == null) return false;
      if(isSameTree(root , subRoot)) return true;

      return isSubtree(root.left , subRoot) || isSubtree(root.right , subRoot);
    }

    public boolean isSameTree(TreeNode r, TreeNode s){
        if(r == null && s == null) return true;
        if(r == null || s == null) return false;
        if(r.val != s.val) return false;

        return isSameTree(r.left , s.left) && isSameTree(r.right , s.right);
    }   
}