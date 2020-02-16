/*
 * @lc app=leetcode id=204 lang=java
 *
 * [204] Count Primes
 */

// @lc code=start
class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        int sum = 0;
        boolean[] notPrime = new boolean[n];
        notPrime[0] = false; notPrime[1] = true; 
        for(int i = 2;i<n;i++){
            if(notPrime[i])
                continue;
            else{
                for(int j = i*2;j<n;j+=i)
                    notPrime[j] = true;
                sum++;
            }
        }
        return sum;
    }
}
// @lc code=end

