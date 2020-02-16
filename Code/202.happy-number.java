import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        
        while (true) {
            int sum = 0;
            while (n>0) {
                sum += ((n%10)*(n%10));
                n /= 10;
            }
            
            if (sum == 1)
                return true;
            
            if (set.contains(sum))
                return false;
            
            set.add(sum);
            n = sum;
        }
    }
}
// @lc code=end

