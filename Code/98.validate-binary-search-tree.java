/*
 * @lc app=leetcode id=98 lang=java
 *
 * [98] Validate Binary Search Tree
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
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        boolean result = isLeft(root, root.left) && isRight(root, root.right);
        return result && isValidBST(root.left) && isValidBST(root.right);
    }

    public boolean isLeft(TreeNode root, TreeNode leftSub){
        if(root==null || leftSub==null) return true;
        boolean result = leftSub.val < root.val && isLeft(root, leftSub.left) && isLeft(root, leftSub.right);
        return result;
    }

    public boolean isRight(TreeNode root, TreeNode rightSub){
        if(root==null || rightSub==null) return true;
        boolean result = rightSub.val > root.val && isRight(root, rightSub.left) && isRight(root, rightSub.right);
        return result;
    }
}
// @lc code=end

