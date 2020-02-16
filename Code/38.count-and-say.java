
/*
 * @lc app=leetcode id=38 lang=java
 *
 * [38] Count and Say
 */

// @lc code=start
class Solution {
    public String countAndSay(int n) {
        String say = "1";
        int index = 1;
        String temp = "";
        while(index < n){
            int scan = 0;
            while(scan < say.length()){
                String max_string = find_string(say.substring(scan), say.charAt(scan));
                temp = temp + max_string.length() + say.charAt(scan);
                scan = scan + max_string.length();
            }
            say = temp;
            temp = "";
            index++;
        }
        return say;
    }

    public String find_string(String sub_string, Character c){
        int index = 0;
        while(true){
            if(index == sub_string.length()){
                return sub_string;
            }

            if(sub_string.charAt(index) == c){
                index++;
            }else{
                return sub_string.substring(0, index);
            }
        }
    }
}
// @lc code=end

