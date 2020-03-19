#
# @lc app=leetcode id=106 lang=python3
#
# [106] Construct Binary Tree from Inorder and Postorder Traversal
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def buildTree(self, inorder: List[int], postorder: List[int]) -> TreeNode:
        if len(inorder) == 0 | len(postorder) == 0:
            return None
        root = TreeNode(postorder[-1])
        def find(inorder, val):
            for i in range(len(inorder)):
                if inorder[i] == val:
                    return i
            return -1
        rootIndex = find(inorder, root.val)
        if rootIndex == -1:
            return root
        root.left = self.buildTree(inorder[:rootIndex], postorder[:rootIndex])
        root.right = self.buildTree(inorder[rootIndex+1:], postorder[rootIndex:-1])
        return root
        
# @lc code=end

