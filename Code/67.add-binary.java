import java.util.HashMap;

/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        int jinwei = 0;
        int index_a = a.length()-1;
        int index_b = b.length()-1;
        String str = "";
        while(index_a >=0 | index_b >= 0 | jinwei > 0){
            int digit_a = index_a >= 0 ? Character.getNumericValue(a.charAt(index_a)) : 0;
            int digit_b = index_b >= 0 ? Character.getNumericValue(b.charAt(index_b)) : 0;
            int digit = (digit_a + digit_b + jinwei) % 2;
            jinwei = (digit_a + digit_b + jinwei) >= 2 ? 1:0;
            str = digit + str;
            index_a--;
            index_b--;
        }
        return str;
    }
}
// @lc code=end

