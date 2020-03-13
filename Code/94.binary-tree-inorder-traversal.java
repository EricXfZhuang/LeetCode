import java.util.*;
/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> rs = new ArrayList<>();
        dfs(rs, root);
        return rs;
    }

    public void dfs(List<Integer> rs, TreeNode root){
        if(root==null) return;
        dfs(rs, root.left);
        rs.add(root.val);
        dfs(rs, root.right);
    }
}
// @lc code=end

