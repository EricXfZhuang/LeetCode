/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0){
            return 0;
        }
        int len = s.length();
        int i = len-1;
        int count = 0;
        //check if s[i] is ' '
        while(s.charAt(i) == ' '){
            i--;
            if(i < 0){
                return count;
            }
        }
        char c = s.charAt(i);
        while(c != ' '){
            count++;
            --i;
            if(i<0){
                return count;
            }else{
                c = s.charAt(i);
            }
        }
        return count;
    }
}
// @lc code=end

