import java.util.*;
/*
 * @lc app=leetcode id=230 lang=java
 *
 * [230] Kth Smallest Element in a BST
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
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    public int kthSmallest(TreeNode root, int k) {
        dfs(root);
        while(k > 1){
            pq.poll();
            k--;
        }
        return pq.poll();
    }

    public void dfs(TreeNode root){
        if(root == null) return;
        pq.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
}
// @lc code=end

