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


import java.util.HashMap;

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }

        return constructTree(preorder, inorder, indexMap, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode constructTree(int[] preorder, int[] inorder, HashMap<Integer, Integer> indexMap,
        int preIndStart, int preIndeEnd, int inIndStart, int inIndeEnd) {

        if (preIndStart > preIndeEnd || inIndStart > inIndeEnd) {
            return null;
        }

        int rootData = preorder[preIndStart];
        int rootIndex = indexMap.get(rootData);
        TreeNode root = new TreeNode(rootData);

        int leftTreeSize = rootIndex - inIndStart;

        root.left = constructTree(preorder, inorder, indexMap, preIndStart + 1, preIndStart + leftTreeSize, inIndStart, rootIndex - 1);

        root.right = constructTree(preorder, inorder, indexMap, preIndStart + leftTreeSize + 1,preIndeEnd, rootIndex + 1, inIndeEnd);

        return root;
    }
}
