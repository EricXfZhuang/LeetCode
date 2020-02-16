/*
 * @lc app=leetcode id=278 lang=java
 *
 * [278] First Bad Version
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=0, end=n;
        while(end-start>1){
            int mid=start+(end-start)/2;
            /** mid = (start+end)) / 2; **/
            if(isBadVersion(mid))  end=mid;
            else  start=mid;
        }
        return end;
    }
}
// @lc code=end

