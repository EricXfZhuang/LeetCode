import java.util.*;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 == 1){
            return false;
        }
        String s_replaced = s;
        while(! s_replaced.isEmpty()){
            if(s_replaced.contains("{}") | s_replaced.contains("[]") | s_replaced.contains("()")){
                s_replaced = s_replaced.replace("{}","");
                s_replaced = s_replaced.replace("()","");
                s_replaced = s_replaced.replace("[]","");
            }else{
                break;
            }
        }
        if(s_replaced.isEmpty()){
            return true;
        }
        return false;
    }

        
}
// @lc code=end

