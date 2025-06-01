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
    // //Recursive Approach here 
    //     List<Integer>  res = new LinkedList<>();
    //     postOrderTraversal(root , res);
    //     return res;
    // }
    // //Recursive Approach here 
    // public void postOrderTraversal(TreeNode root ,  List<Integer> res ){
        
    //     if(root == null){
    //         return;
    //     }
    //     // left child
    //     postOrderTraversal(root.left , res);
    //     // right child
    //     postOrderTraversal(root.right , res);
    //     // root 
    //     res.add(root.val);
    
    // Iterative Approach here
     List<Integer>  res = new  ArrayList<Integer>();
     Stack<TreeNode> stack = new Stack<>();
     TreeNode node = root;

      while(node != null || !stack.isEmpty()){
        // move to left 
          while(node != null){
             stack.push(node);
             node = node.left;
            }
        //move to right 
           if(stack.peek().right != null){
            node = stack.peek().right;
           }else{
             TreeNode temp = stack.pop();
             res.add(temp.val);
             while(!stack.isEmpty() && temp == stack.peek().right){
                 temp = stack.pop();
                 res.add(temp.val); 
             }
           }
       }
       return res;
    }
}