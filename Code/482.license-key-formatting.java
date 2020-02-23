import java.util.*;
/*
 * @lc app=leetcode id=482 lang=java
 *
 * [482] License Key Formatting
 */

// @lc code=start
class Solution {
    public String licenseKeyFormatting(String S, int K) {
        String res = ""; String str = "";
        for(int i = S.length()-1;i>=0;i--){
            if(S.charAt(i)=='-'){
                if(i==0){
                    res = str + res;
                    break;
                }
                continue;
            }else{
                str = S.charAt(i) + str;
            }
            if(str.length()==K){
                res = "-" + str + res;
                str = "";
            }
            if(i==0){
                res = str + res;
                break;
            }
        }
        if(res.isEmpty()) return res;
        while(res.charAt(0)=='-'){
            res = res.substring(1);
        }
        return res.toUpperCase();
    }
}
// @lc code=end

