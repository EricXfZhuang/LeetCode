import java.util.HashMap;
import java.util.Stack;
import java.util.Map.Entry;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=235 lang=java
 *
 * [235] Lowest Common Ancestor of a Binary Search Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if((root.val-p.val)*(root.val-q.val)<=0){
            return root;
        }else if(root.val > p.val){
            return lowestCommonAncestor(root.left, p, q);
        }else{
            return lowestCommonAncestor(root.right, p, q);
        }
    }

    


    
    
}
// @lc code=end

