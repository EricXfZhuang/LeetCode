import java.util.*;
/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            String[] strArr = str.split("");
            Arrays.sort(strArr);
            String newStr = "";
            for(String s : strArr){
                newStr += s;
            }
            if(map.containsKey(newStr)){
                map.get(newStr).add(str);
            }else{
                List<String> ls = new ArrayList<>();
                ls.add(str);
                map.put(newStr, ls);
            }
        }

        List<List<String>> rs = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            rs.add(0,entry.getValue());
        }
        return rs;
    }

   
}
// @lc code=end

