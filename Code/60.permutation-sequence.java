import java.util.*;
/*
 * @lc app=leetcode id=60 lang=java
 *
 * [60] Permutation Sequence
 */

// @lc code=start
class Solution {
    // 1. brute force time limit exceed
    // String rs = ""; int count;
    // public String getPermutation(int n, int k) {
    //     String curr = "";
    //     count = k;
    //     dfs(n, curr);
    //     return rs;
    // }

    // public void dfs(int n, String curr){
    //     if(curr.length() == n){
    //         count--;
    //         if(count == 0) rs = curr;
    //         return;
    //     }
        
    //     for(int i = 1; i <= n; i++){
    //         if(curr.contains(Integer.toString(i))) continue;
    //         dfs(n, curr + i);
    //         if(count == 0) return;
    //     }
    // }

    public String getPermutation(int n, int k){
        int interval = permutation(n-1);
        List<Integer> nums = new ArrayList<>();
        if(n == 1) return Integer.toString(1);
        for(int i = 1; i <= n; i++) nums.add(i); 
        return getPermutation(interval, n-1, k, nums);
    }

    public String getPermutation(double interval, int n, double k, List<Integer> nums){
        String str = "";
        while(!nums.isEmpty()){
            int index = (int) Math.ceil(k/interval)-1;
            System.out.println(index);
            str += nums.get(index);
            nums.remove(index);
            k -= index * interval;
            interval /= n--;
        }
        return str;
    }

    public int permutation(int n){
        if(n <= 1) return 1;
        return n * permutation(n-1);
    }
}
// @lc code=end

