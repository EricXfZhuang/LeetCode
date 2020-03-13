import java.util.*;
/*
 * @lc app=leetcode id=114 lang=java
 *
 * [114] Flatten Binary Tree to Linked List
 */

import javax.swing.tree.TreeNode;

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
    Queue<TreeNode> ascList = new LinkedList<>();
    public void flatten(TreeNode root) {
        dfs(root);
        TreeNode curr = root;
        while(!ascList.isEmpty()){
            curr.left = null; curr.right = null;
            curr.right = ascList.poll();
            curr = curr.right;
        }
    }

    public void dfs(TreeNode root){
        if(root==null) return;
        if(root.left!=null){
            ascList.add(root.left);
            dfs(root.left);
        }

        if(root.right!=null){
            ascList.add(root.right);
            dfs(root.right);
        }

    }
}
// @lc code=end

