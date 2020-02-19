import java.util.*;
/*
 * @lc app=leetcode id=443 lang=java
 *
 * [443] String Compression
 */

// @lc code=start
class Solution {
    public int compress(char[] chars) {
        if(chars.length==0) return 0;
        if(chars.length==1) return 1;
        int lenArr = 1;
        int prevIndex = 1;
        char prevChar = chars[0];
        int count = 1;
        for(int i = 1;i < chars.length;i++){
            if(chars[i]!=prevChar | i==chars.length-1){
                char currChar = chars[i];
                lenArr++;
                if(i==chars.length-1)
                    if(chars[i]==prevChar){
                        count++;
                        lenArr--;
                    }
                if(count > 1){
                    char[] digits = Integer.toString(count).toCharArray();
                    lenArr += digits.length;
                    for(char c : digits){
                        chars[prevIndex++] = c;
                    }
                }
                count = 1;
                if(prevChar!=currChar){
                    chars[prevIndex++] = chars[i];
                    prevChar = chars[i];
                }
            }else{
                count++;
            }
        }
        return lenArr;
    }
}
// @lc code=end

