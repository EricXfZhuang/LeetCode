import java.util.*;
/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 */

// @lc code=start
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ret = new LinkedList<String>();
        HashSet<String> set = new HashSet<String>();
        if(n<1) return ret;
        for(int i = 0; i < n; i++){
            if(i==0){
                set.add("()");
            }else{
                Set setCopy = (Set) set.clone();
                Iterator<String> iter = setCopy.iterator();
                while(iter.hasNext()){
                    String str = iter.next();
                    for(int j = 0; j < str.length(); j++){
                        String newStr = str.substring(0, j) + "()" + str.substring(j,str.length());
                        set.add(newStr);
                    }
                }
            }
        }
        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            String str = iter.next();
            if(str.length()==2*n){
                ret.add(str);
            }
        }
        return ret;
    }
}
// @lc code=end

