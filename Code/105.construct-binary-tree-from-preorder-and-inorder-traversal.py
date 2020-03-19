#
# @lc app=leetcode id=105 lang=python3
#
# [105] Construct Binary Tree from Preorder and Inorder Traversal
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> TreeNode:
        if len(preorder) == 0 or len(inorder) == 0:
            return None
        root = TreeNode(preorder[0])
        
        def find(inorder, val):
            for i in range(len(inorder)):
                if inorder[i] == val:
                    return i
            return -1

        rootIndex = find(inorder, root.val)
        if rootIndex == -1:
            return None
        root.left = self.buildTree(preorder[1:], inorder[:rootIndex])
        root.right = self.buildTree(preorder[rootIndex+1:], inorder[rootIndex+1:])
        return root

# @lc code=end

