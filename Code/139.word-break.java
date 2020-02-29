import java.util.*;
/*
 * @lc app=leetcode id=139 lang=java
 *
 * [139] Word Break
 */

// @lc code=start
class Solution {
    String str;
    Set<Integer> cache;
    List<String> list;
    public boolean wordBreak(String s, List<String> wordDict) {
       str=s;
       cache=new HashSet<Integer>();
       list=wordDict;
       return wordBreak(0);
    }
     private boolean wordBreak(int d){
        if(d == str.length()) return true;
        if(cache.contains(d)) return false;//无需再次重复计算，剪枝
        for(String word : list){
            if(str.startsWith(word, d)){
                if(wordBreak(d+word.length())) return true;
                cache.add(d+word.length());//已经为false的
            }
        }
        return false;
    }
}
// @lc code=end

