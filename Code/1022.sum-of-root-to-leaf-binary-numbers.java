/*
 * @lc app=leetcode id=1022 lang=java
 *
 * [1022] Sum of Root To Leaf Binary Numbers
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
    int sum = 0;
    public int sumRootToLeaf(TreeNode root) {
        dfs(root, "");
        return sum;
    }

    public void dfs(TreeNode root, String binStr){
        if(root == null) return;
        if(root.left == null && root.right == null){
            sum += Integer.parseInt(binStr + root.val, 2);
            return;
        }
        
        binStr += root.val;
        dfs(root.left, binStr);
        dfs(root.right, binStr);
    }
}
// @lc code=end

