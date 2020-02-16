/*
 * @lc app=leetcode id=374 lang=java
 *
 * [374] Guess Number Higher or Lower
 */

// @lc code=start
/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        if(guess(n)==0){
            return n;
        }
        return myrec(1, n);
    }

    //binary search 
    public int myrec(int start, int end){
        int mid = (end-start)/2 + start;
        if(guess(mid)==0){
            return mid;
        }else if(guess(mid)==1){
            return myrec(mid+1, end);
        }else{
            return myrec(start, mid-1);
        }
    }
}
// @lc code=end

