import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * @lc app=leetcode id=108 lang=java
 *
 * [108] Convert Sorted Array to Binary Search Tree
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return my_rec(nums, 0, nums.length-1);
    }

    public TreeNode my_rec(int[] nums, int l, int r){
        if(l > r) return null;
        
        int m = (l+r)/2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = my_rec(nums, l, m-1);
        root.right = my_rec(nums, m+1, r);
        return root;
    }
}
// @lc code=end

