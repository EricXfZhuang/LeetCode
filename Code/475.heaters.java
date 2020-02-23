import java.util.Arrays;
import java.util.TreeSet;

/*
 * @lc app=leetcode id=475 lang=java
 *
 * [475] Heaters
 */

// @lc code=start
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int radius = 0;
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(Integer heat : heaters){
            set.add(heat);
        }
        int tailDist = set.floor(houses[houses.length-1])==null ? 0 : houses[houses.length-1]-set.floor(houses[houses.length-1]);
        radius = Math.max(set.ceiling(houses[0])-houses[0], tailDist);
        int prevHeater = set.pollFirst();
        if(set.isEmpty()) return radius;
        System.out.println(radius);
        for(Integer house : houses){
            if(set.ceiling(house)!=null && set.ceiling(house) <= houses[houses.length-1]){
                radius = (int) Math.max(radius, Math.ceil(set.ceiling(house) - prevHeater - 1) / 2.0);
            }else{
                if(set.floor(houses[houses.length-1])==null){
                    return radius;
                }else{
                    radius = Math.max(radius, houses[houses.length-1]-set.floor(houses[houses.length-1]));
                    return radius;
                }
            }
            prevHeater = set.ceiling(house);
        }
        return radius;
    }
}
// @lc code=end

