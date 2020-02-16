import java.util.*;
import java.util.Map.Entry;

/*
 * @lc app=leetcode id=299 lang=java
 *
 * [299] Bulls and Cows
 */

// @lc code=start
class Solution {
    public String getHint(String secret, String guess) {
        //cal bulls
        int bulls = 0;
        for(int i = 0;i < guess.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bulls++;
            }
        }
        //cal cows
        int cows = 0; 
        for(int i = 0;i < guess.length();i++){
            String c = Character.toString(guess.charAt(i));
            if(secret.contains(c)){
                cows++;
                secret = secret.replaceFirst(c, "");
            }
        }
        cows = cows - bulls;
        return bulls + "A" + cows + "B";
    }
}
// @lc code=end

