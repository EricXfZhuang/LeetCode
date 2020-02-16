import java.util.*;

/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        if(s.equals(" ")) return s;
        String vowels = "aeiouAEIOU";
        String cStr = "";
        List<Integer> indexArr = new ArrayList();
        for(int i = 0;i < s.length();i++){
            if(vowels.contains(Character.toString(s.charAt(i)))){
                cStr = s.charAt(i)+cStr;
                indexArr.add(i);
            }
        }
        for(int i = 0;i < indexArr.size();i++){
            int rep = indexArr.get(i);
            String rem;
            if(rep+1==s.length()){
                rem = "";
            } else{
                rem = s.substring(rep + 1);
            }
            s =  s.substring(0, rep) + cStr.charAt(i) + rem;
        }
        return s;
    }
}
// @lc code=end

