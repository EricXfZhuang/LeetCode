#
# @lc app=leetcode id=7 lang=python3
#
# [7] Reverse Integer
#

# @lc code=start
class Solution:
    def reverse(self, x: int) -> int:
        res = 0
        exp = 9  
        Neg, Pos = False, False
        if abs(x) // (10 ** 10) != 0:
            return 0
        if x < 0:
            Neg = True
        elif x > 0:
            Pos = True
        else:
            return 0
        x = abs(x)

        if x > 10 ** 10 or x < -(10 ** 10):
            return 0    
        while exp >= 0:
            sig = 10 ** exp
            if x // sig == 0:
                exp -= 1
                continue
            else:
                break
        l = exp
        index = l
        while x != 0:
            quotient = x // sig
            res += quotient * 10 ** (l - index)
            if quotient != 0:
                x -= quotient * sig
            index -= 1
            sig = 10 ** index
        res = res if Pos else -(res)
            
        if res > (2 ** 31 - 1) or res < -(2 ** 31):
            return 0
        return res 
# @lc code=end

