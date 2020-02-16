import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * @lc app=leetcode id=107 lang=java
 *
 * [107] Binary Tree Level Order Traversal II
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
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(root==null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = q.size();
            for(int i = 0;i < size;i++){
                TreeNode parent = q.poll();
                list.add(parent.val);
                if(parent.left!=null) q.add(parent.left);
                if(parent.right!=null) q.add(parent.right);
            }
            result.add(0,list);
        }
        return result;
        
    }

   

    }

// @lc code=end

