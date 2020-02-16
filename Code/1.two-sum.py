#
# @lc app=leetcode id=1 lang=python3
#
# [1] Two Sum
#

# @lc code=start
import collections
from collections import defaultdict

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        my_dict = defaultdict(lambda: [])
        for (index, value) in enumerate(nums):
            my_dict[value].append(index)
        nums.sort()
        print(nums)
        head_index = 0
        tail_index = len(nums) - 1
        head = nums[head_index]
        tail = nums[tail_index]
        if head_index == tail_index:
            return []
        while head_index != tail_index:
            sum1 = head + tail
            print(sum1)
            if sum1 == target:
                index1 = my_dict[head].pop()
                index2 = my_dict[tail].pop()
                res = [index1, index2] if index1 < index2 else [index2, index1]
                return res

            if head_index == tail_index:
                return []
            elif sum1 > target:
                tail_index -= 1
            elif sum1 < target:
                head_index += 1
            
            head = nums[head_index]
            tail = nums[tail_index]
        return []


        
        
# @lc code=end

