/*
 * @lc app=leetcode id=872 lang=java
 *
 * [872] Leaf-Similar Trees
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> seq1 = new ArrayList<>();
        List<Integer> seq2 = new ArrayList<>();
        leafSeq(root1, seq1);
        leafSeq(root2, seq2);
        return seq1.equals(seq2);
    }

    public void leafSeq(TreeNode root, List<Integer> seq){
        if(root == null) return;
        if(root.left == null && root.right == null){
            seq.add(root.val);
            return;
        }
        leafSeq(root.left, seq);
        leafSeq(root.right, seq);
    }
}
// @lc code=end

