import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.text.html.HTMLDocument.Iterator;

/*
 * @lc app=leetcode id=122 lang=java
 *
 * [122] Best Time to Buy and Sell Stock II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<=1) return 0;
        int maxProfit = 0;
        for(int i = 1;i < prices.length;i++){
            if(prices[i] > prices[i-1]){
                maxProfit += prices[i]-prices[i-1];
            }
        }
        return maxProfit;
    }

    
}
// @lc code=end

