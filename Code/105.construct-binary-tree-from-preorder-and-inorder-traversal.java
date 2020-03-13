/*
 * @lc app=leetcode id=105 lang=java
 *
 * [105] Construct Binary Tree from Preorder and Inorder Traversal
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private int pre = 0;
    private int in = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
       return buildTree(preorder, inorder, Integer.MAX_VALUE);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder, long stop){
        if(pre==preorder.length){
            return null;
        }
        if(inorder[in]==stop){
            in++;
            return null;
        }
        int val = preorder[pre++];
        TreeNode root = new TreeNode(val);
        root.left = buildTree(preorder, inorder, val);
        root.right = buildTree(preorder, inorder, stop);
        return root;
    }
}
// @lc code=end

