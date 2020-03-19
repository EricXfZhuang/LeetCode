#
# @lc app=leetcode id=120 lang=python3
#
# [120] Triangle
#

# @lc code=start
class Solution:
    def minimumTotal(self, triangle: List[List[int]]) -> int:
        dp = []
        for arr in triangle[-1:]:
            rs += min(arr)
        return rs
# @lc code=end

