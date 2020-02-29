import copy
#
# @lc app=leetcode id=139 lang=python3
#
# [139] Word Break
#

# @lc code=start
class Solution:
    words = []

    def isEqual(self, s: str):
        wd = ""
        for word in words:
            wd += word
        return wd == s  

    def wordBreak(self, s: str, wordDict: List[str]) -> bool:
        if s in wordDict:
            words.append(s)
            return True
        for i in range(len(s)):
            if s[0:i+1] in wordDict:
                words.append(s[0:i+1])
                if wordBreak(s[i+1:], wordDict) != True:
                    words.clear()
            if self.isEqual(s):
                return True
        return False
     
         
# @lc code=end

