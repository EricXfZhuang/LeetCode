import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=111 lang=java
 *
 * [111] Minimum Depth of Binary Tree
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
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int cost = 1;
        while(!q.isEmpty()){
            int len = q.size();
            for(int i = 0;i < len;i++){
                TreeNode parent = q.poll();
                if((parent.left==null) && (parent.right==null)) return cost;
                if(parent.left!=null) q.add(parent.left);
                if(parent.right!=null) q.add(parent.right);
            }
            cost++;
        }
        return -1;
    }

    
}
// @lc code=end

