import java.util.*;
/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
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
    Map<Integer, List<Integer>> map = new HashMap<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> rs = new ArrayList<>();
        if(root==null) return rs;
        dfs(root, 0);
        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
            rs.add(entry.getValue());
        }
        return rs;
    }

    public void dfs(TreeNode root, int level){
        if(root==null) return;
        if(map.containsKey(level)){
            map.get(level).add(root.val);
        }else{
            List<Integer> ls = new ArrayList<>();
            ls.add(root.val);
            map.put(level, ls);
        }
        dfs(root.left, level+1);
        dfs(root.right, level+1);  
    }
}
// @lc code=end

