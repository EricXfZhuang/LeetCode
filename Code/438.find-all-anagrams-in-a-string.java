import java.util.*;
/*
 * @lc app=leetcode id=438 lang=java
 *
 * [438] Find All Anagrams in a String
 */

// @lc code=start
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> pMap = new HashMap<Character, Integer>();
        for(Character c : p.toCharArray()){
            pMap.put(c, pMap.getOrDefault(c, 0)+1);
        }

        List<Integer> res = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for(int l = 0, r = l; r < s.length(); r++){
            // System.out.println("l:"+l);
            // System.out.println("r:"+r);
            char c = s.charAt(r);
            if(!pMap.containsKey(c)) {
                map.clear();
                r = l; 
                l = l+1;
                continue;
            }
            map.put(c, map.getOrDefault(c, 0)+1);

            if((r-l+1)==p.length()){
                //System.out.println(map.toString());
                if(map.equals(pMap)) res.add(l);
                map.clear();
                r = l;
                l = l+1;
            }
        }
        return res;
    }

    


}
// @lc code=end

