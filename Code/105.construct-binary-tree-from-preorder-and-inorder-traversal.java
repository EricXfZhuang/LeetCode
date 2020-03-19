/*
 * @lc app=leetcode id=105 lang=java
 *
 * [105] Construct Binary Tree from Preorder and Inorder Traversal
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       if(preorder.length < 1 || inorder.length < 1) return null;
       return buildTree(preorder, inorder, 0, 0, inorder.length);       
    }

    public TreeNode buildTree(int[] preorder, int[] inorder, int preIndex, int inStart, int inEnd){
        if(preIndex == preorder.length){
            return null;
        }else if(inStart >= inEnd){
            return null;
        }

        TreeNode root = new TreeNode(preorder[preIndex]);
        
        int rootIndex = -1;
        for(int i = inStart; i < inEnd; i++){
            if(inorder[i] == root.val){
                rootIndex = i;
            }
        }
        //System.out.println("rootIndex:"+rootIndex+"root:"+root.val);
        if(rootIndex == -1) return root;
        
        root.left = buildTree(preorder, inorder, preIndex+1, inStart, rootIndex);
        root.right = buildTree(preorder, inorder, rootIndex + preIndex - inStart + 1, rootIndex+1, inEnd);
        return root;
    }
}
// @lc code=end

