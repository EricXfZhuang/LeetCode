import java.util.*;

/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        // if(s.equals(" ")) return s;
        // String vowels = "aeiouAEIOU";
        // String cStr = "";
        // List<Integer> indexArr = new ArrayList();
        // for(int i = 0;i < s.length();i++){
        //     if(vowels.contains(Character.toString(s.charAt(i)))){
        //         cStr = s.charAt(i)+cStr;
        //         indexArr.add(i);
        //     }
        // }
        // for(int i = 0;i < indexArr.size();i++){
        //     int rep = indexArr.get(i);
        //     String rem;
        //     if(rep+1==s.length()){
        //         rem = "";
        //     } else{
        //         rem = s.substring(rep + 1);
        //     }
        //     s =  s.substring(0, rep) + cStr.charAt(i) + rem;
        // }
        // return s;
        if(s.isBlank()) return s;
        Character[] vowelsArr = {'a','e','i','o','u','A','E','I','O','U'};
        HashSet<Character> vowels = new HashSet<Character>(Arrays.asList(vowelsArr));

        List<Integer> indexLs = new ArrayList<Integer>();
        for(int i = 0;i<s.length();i++){
            if(vowels.contains(s.charAt(i))){
                indexLs.add(i);
            }
        }
        
        if(indexLs.size()==0) return s;

        int frontIndexOfindeLs = 0; int tailIndexOfindexLs = indexLs.size()-1;
        int frontIndex = indexLs.get(frontIndexOfindeLs); int tailIndex = indexLs.get(tailIndexOfindexLs);
        while(frontIndex<tailIndex){
            char frontChar = s.charAt(frontIndex);
            char tailChar = s.charAt(tailIndex);
            s = s.substring(0, frontIndex) + tailChar + s.substring(frontIndex+1, tailIndex) + frontChar + s.substring(tailIndex+1, s.length());
            frontIndex = indexLs.get(++frontIndexOfindeLs);
            tailIndex = indexLs.get(--tailIndexOfindexLs);
        }
        return s;
    }
}
// @lc code=end

