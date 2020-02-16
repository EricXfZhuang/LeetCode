/*
 * @lc app=leetcode id=258 lang=java
 *
 * [258] Add Digits
 */

// @lc code=start
class Solution {
    public int addDigits(int num) {
        // String str = Integer.toString(num);
        // if(str.length()==1)
        //     return num;
        // String[] strArr = str.split("",0);
        // int sum = 0;
        // for(int i = 0;i < strArr.length;i++) 
        //     sum += Integer.parseInt(strArr[i]);
        // return addDigits(sum);
        if(num<10)
            return num;
        int sum = 0;
        while(num>0){
            sum += num%10;
            num /= 10;
        }
        return addDigits(sum);
    }
}

// @lc code=end

