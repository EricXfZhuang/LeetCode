import java.util.*;
/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start
class Solution {
    
    public static Map<Character, String> map = 
    Map.of('2', "abc", '3', "def", '4', "ghi", '5', "jkl", '6', "mno",
    '7', "pqrs", '8', "tuv", '9', "wxyz");

    public List<String> letterCombinations(String digits) {
        List<String> ret = new ArrayList<String>();
        //1. regular method, iterative beats 36.49%
        // if(digits.length()==0) return ret;
        // int len = 0;int index = 0;
        // for(int i = digits.length()-1;i>=0;i--){
        //     if(i==digits.length()-1){
        //         //first time, initialize
        //         for(String c : map.get(digits.charAt(i)).split("")){
        //             ret.add(c);
        //         }
        //     }else{
        //         len = ret.size();
        //         for(int j = index;j<len;j++){
        //             for(String c : map.get(digits.charAt(i)).split("")){
        //                 ret.add(c+ret.get(j));
        //             }
        //         }
        //         index = len;
        //     }
        // }
        // return ret.subList(index, ret.size());

        // 2. Backtracking method beats 36.49%
        /**
         * s(digits[0...n-1])
         *  = map(digits[0]) + s(digits[1..n-1])
         *  = map(digits[0]) + letter(digits[1]) + s(digits[2..n-1])
         */
        letterCombination(ret, digits, 0);
        return ret;
    }

    public void letterCombination(List<String> ret, String digits, int start) {
        if(start==digits.length()) return;
        if(start==0){
            for(String c : map.get(digits.charAt(start)).split("")){
                String str = c + "";
                ret.add(str);
            }
            letterCombination(ret, digits, start+1);
        }else{
            int len = ret.size();
            for(int i = 0;i<len;i++){
                String oldStr = ret.get(0);
                ret.remove(0);
                for(String c : map.get(digits.charAt(start)).split("")){
                    ret.add(oldStr+c);
                }
            }
            letterCombination(ret, digits, start+1);
        }
    }

    
}
// @lc code=end
