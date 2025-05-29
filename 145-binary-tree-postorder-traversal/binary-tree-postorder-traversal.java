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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer>  res = new LinkedList<>();
        postOrderTraversal(root , res);

        return res;
    }
    public void postOrderTraversal(TreeNode root ,  List<Integer> res ){
        
        if(root == null){
            return;
        }
        // left child
        postOrderTraversal(root.left , res);
        // right child
        postOrderTraversal(root.right , res);
        // root 
        res.add(root.val);
    }
}