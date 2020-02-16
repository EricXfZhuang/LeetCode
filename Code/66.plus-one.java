import java.util.Arrays;
import java.util.LinkedList;

/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int[] plus_one = new int[len+1];
        plus_one[0] = 0;
        for(int i = 0;i < len;i++){
            plus_one[i+1] = digits[i];
        }
        
        plus_one[len]++;
        for(int i = len-1;i >= 0;i--){
            int digit = plus_one[i+1];
            if(digit == 10){
                plus_one[i+1] = 0;
                plus_one[i]++;
                continue;
            }else{
                break;
            }
        }
        if(plus_one[0] == 0){
            return Arrays.copyOfRange(plus_one, 1, len+1);
        }else{
            return plus_one;
        }
    }
}
// @lc code=end

