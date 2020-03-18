import java.util.*;
/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] ZigZag Conversion
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        int len = s.length();
        int m = numRows;
        if(m==1) return s;
        int n = (len/m) * (m-1);
        if(len%m!=0) n++;
        char[][] arr = new char[m][n];
        int sIndex = 0;
        int i = 0, j = 0;
        int flag = 1;
        while(sIndex < len){
            arr[i][j] = s.charAt(sIndex++);
            if(flag==1){
                i++;
            }else{
                i--; j++;
            }
            flag = i == m-1 ? 2 : flag;
            flag = i == 0 ? 1 : flag;
        }
        String rs = "";
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                if(arr[i][j]!=(char)0){
                    rs += arr[i][j];
                }
            }
        }
        return rs;
    }
}
// @lc code=end

