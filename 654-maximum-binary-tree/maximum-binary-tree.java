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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
    
        if(nums == null){
            return null;
        }
        return build(nums , 0 , nums.length-1);
    }

    public TreeNode build(int [] nums , int start , int end){
        if(start > end) return null;

        int IdxMax = start;

        for(int i = start+1; i <= end; i++){
            if(nums[i] > nums[IdxMax]){
                IdxMax = i;
            }
        } 
        // making root here 
        TreeNode root = new TreeNode(nums[IdxMax]);

        // left child of root max
        root.left = build(nums , start , IdxMax - 1);
        // right child of root max
        root.right = build(nums , IdxMax + 1, end);

        return root;
    }
}