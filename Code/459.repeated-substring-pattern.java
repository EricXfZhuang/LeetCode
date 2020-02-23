/*
 * @lc app=leetcode id=459 lang=java
 *
 * [459] Repeated Substring Pattern
 */

// @lc code=start
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        System.out.println(s.length());
        for(int i = 0;i<s.length();i++){
            String sub = s.substring(0, i+1);
            int repeatedTimes;
            if(s.length()%sub.length()==0){
                repeatedTimes = s.length()/sub.length();
            }else{
                continue;
            }
            if(repeatedTimes<2) continue;
            String copy = "";
            for(int j = 0;j < repeatedTimes;j++){
                copy += sub;
            }
            if(s.equals(copy)){
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

