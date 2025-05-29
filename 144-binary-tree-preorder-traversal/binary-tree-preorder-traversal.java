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
    public List<Integer> preorderTraversal(TreeNode root){
       
       List<Integer> res = new ArrayList<>();;
       preOrderTraversal(root,res);

       return res;
    }

    public static void preOrderTraversal(TreeNode root , List<Integer> res){
        if(root == null){
            return;
        }
        
        // System.out.println(root.data);
        res.add(root.val);
        preOrderTraversal(root.left , res);
        preOrderTraversal(root.right , res);
        
    }
}