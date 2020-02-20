import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=447 lang=java
 *
 * [447] Number of Boomerangs
 */

// @lc code=start
class Solution {
    public int numberOfBoomerangs(int[][] points) {
        if(points.length<3) return 0; 
        int result = 0;
        HashMap<Double, Integer> distMap = new HashMap<Double, Integer>();
        for(int i = 0;i < points.length;i++){
            distMap.clear();
            for(int j = 0;j < points.length;j++){
                if(i==j) continue;
                double distanceij = dist(points[i], points[j]);
                if(!distMap.containsKey(distanceij)){
                    distMap.put(distanceij, 1);
                }else{
                    distMap.put(distanceij, distMap.get(distanceij)+1);
                }
            }
            for(Map.Entry<Double, Integer> entry : distMap.entrySet()){
                if(entry.getValue() < 2){
                    continue;
                }else{
                    result += entry.getValue() * (entry.getValue()-1);
                }
            }
        }
        return result;
    }

    public double dist(int[] point1, int[] point2){
        return Math.pow(Math.abs(point1[0]-point2[0]), 2) 
                + Math.pow(Math.abs(point1[1]-point2[1]), 2);
    }
}
// @lc code=end

