import java.util.*;
/*
 * @lc app=leetcode id=454 lang=java
 *
 * [454] 4Sum II
 */

// @lc code=start
class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        /**
         * map.put(sum(A[i]+B[j]), count)
         * rs += (map.get(-sum(C[i]+D[j])))
         * O(N ^ 2)
         */

        int len = A.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                map.compute(A[i] + B[j], (key, val) -> val == null ? 1 : val+1);
            }
        }

        int rs = 0;
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                int sum = C[i] + D[j];
                if(map.containsKey(-sum)){
                    rs += (map.get(-sum));
                }
            }
        }
        return rs;
    }    
}
// @lc code=end

