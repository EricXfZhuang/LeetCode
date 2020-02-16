// import java.util.ArrayList;

/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(final int x) {
        String str = Integer.toString(x);
        int len = str.length();
        char first_char = str.charAt(0);
        if(first_char == '-'){
        return false;
        }
        int mid = (int) Math.floor(len / 2.0);
        for(int i = 0;i < len;i++){
            if(i == mid){
                return true;
            }
            if(str.charAt(i) != str.charAt(len-1-i)){
                return false;
            }
        }
        return true;
        // if (x < 0) {
        //     return false;
        // }
        // ArrayList<Integer> arr = new ArrayList<Integer>();
        // int i = 0;
        // int y = x;
        // while(true){
        //     if(y == 0){
        //         break;
        //     }
        //     arr.add((int) (y % Math.pow(10, i + 1)));
        //     y = (int)(y / 10);
        // }
        // int len = arr.size();
        // int mid = (int)(len/2);
        // for(i = 0;i < mid+1;i++){
        //     if(i == mid){
        //         return true;
        //     }
        //     if(arr.get(i) != arr.get(len-1-i)){
        //         return false;
        //     }
        // }
        // return true;


    }
}
// @lc code=end

