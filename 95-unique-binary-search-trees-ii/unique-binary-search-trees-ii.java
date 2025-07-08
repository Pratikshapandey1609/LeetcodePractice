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
    public List<TreeNode> generateTrees(int n) {
        
       if (n == 0){
         return new ArrayList<>();
       }
        return solve(1 , n);
    }

    public List<TreeNode> solve(int start , int end){

        List<TreeNode> result = new ArrayList<>();
        // base case 
        if(start > end){
            result.add(null);
            return result;
        }

        // subProblem here to reach leaf node
        for(int i = start; i <= end; i++){
            List<TreeNode> left =  solve(start , i - 1);
            List<TreeNode> right = solve(i + 1 , end);
  
            for(TreeNode left_BST : left){
                for(TreeNode right_BST : right){
                    TreeNode root = new TreeNode(i);
                    root.left = left_BST;
                    root.right = right_BST;
                    result.add(root);
                }
            }
        }
        return result;
    }
}