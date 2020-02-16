/*
 * @lc app=leetcode id=303 lang=java
 *
 * [303] Range Sum Query - Immutable
 */

// @lc code=start
class NumArray {

    private int[] arr;
    public NumArray(int[] nums) {
        this.arr = nums;
    }
    
    public int sumRange(int i, int j) {
        int sum = 0;
        while(i<j){
            sum += this.arr[i];
            sum += this.arr[j];
            i++;
            j--;
        }
        if((j-i+1)%2==1)
            sum += this.arr[i];
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
// @lc code=end

