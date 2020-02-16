import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=257 lang=java
 *
 * [257] Binary Tree Paths
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new LinkedList<String>();
        if(root==null) return paths;
        findPaths(paths,Integer.toString(root.val), root);
        return paths;
    }

    public void findPaths(List<String> paths, String path, TreeNode root){
        if(root.left==null && root.right==null){
            paths.add(path);
            return;
        }
        if(root.left!=null)
            findPaths(paths, path+"->"+root.left.val, root.left);
        if(root.right!=null)
            findPaths(paths, path+"->"+root.right.val, root.right);
    }
}
// @lc code=end

