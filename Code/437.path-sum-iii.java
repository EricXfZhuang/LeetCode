/*
 * @lc app=leetcode id=437 lang=java
 *
 * [437] Path Sum III
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
    public int pathSum(TreeNode root, int sum) {
        if(root==null) return 0;
        int pathRoot = findPath(root, 0, sum);
        int pathLeft = 0; int pathRight = 0;
        if(root.left!=null){
            pathLeft = pathSum(root.left, sum);
        }
        if(root.right!=null){
            pathRight = pathSum(root.right, sum);
        }
        return pathRoot + pathLeft + pathRight;
    }

    public int findPath(TreeNode root, int sum, int target){
        if(root==null) 
            return 0;
        sum = sum + root.val;
        if(sum!=target)
            return findPath(root.left, sum, target) + findPath(root.right, sum, target);
        else{
            return 1 + findPath(root.left, sum, target) + findPath(root.right, sum, target);
        }
    }

}
// @lc code=end

