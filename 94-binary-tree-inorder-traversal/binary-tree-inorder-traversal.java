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
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> res = new LinkedList<>();
        InOrderTraversal(root , res);

        return res;
    }
    public void InOrderTraversal(TreeNode root , List<Integer> res){
        if(root ==  null){
            return;
        }
        // left 
        InOrderTraversal(root.left , res);
        // root
        res.add(root.val);
        //right 
        InOrderTraversal(root.right , res);
    }
}