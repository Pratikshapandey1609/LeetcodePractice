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
    //Recurssion Approach 
    // public List<Integer> preorderTraversal(TreeNode root){
       
    //    List<Integer> res = new ArrayList<>();;
    //    preOrderTraversal(root,res);

    //    return res;
    // }
    // public static void preOrderTraversal(TreeNode root , List<Integer> res){
    //     if(root == null){
    //         return;
    //     }
    //     // System.out.println(root.data);
    //     res.add(root.val);
    //     preOrderTraversal(root.left , res);
    //     preOrderTraversal(root.right , res);  
    // }
    
    // Iterative Approach here 
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            res.add(node.val);
            // right child first 
            if(node.right != null){
                stack.push(node.right);
            }
            // left child first 
            if(node.left != null){
                stack.push(node.left);
            }
        }
        return res ;
    }
}
