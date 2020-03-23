import java.util.*;
/*
 * @lc app=leetcode id=89 lang=java
 *
 * [89] Gray Code
 */

// @lc code=start
class Solution {
    public List<Integer> grayCode(int n) {
        List<String> ls = new ArrayList<>();
        List<Integer> rs = new ArrayList<>();
        ls.add(Integer.toString(0));
        rs.add(0);
        if(n == 0) return rs;
        ls.add(Integer.toString(1));
        for(int i = 1; i < n; i++){
            int start = ls.size()-1;
            for(int j = start; j >= 0; j--){
                ls.add(ls.get(j));
            }
            System.out.println(ls.toString());
            for(int j = 0; j < ls.size()/2; j++){
                ls.set(j, 0+ls.get(j));
            }
            for(int j = ls.size()/2; j < ls.size(); j++){
                ls.set(j, 1+ls.get(j));
            }
        }
        rs.clear();
        for(int i = 0; i < ls.size(); i++){
            rs.add(Integer.parseInt(ls.get(i),2));
        }
        return rs;
    }
}
// @lc code=end

