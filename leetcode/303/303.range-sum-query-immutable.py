#
# @lc app=leetcode id=303 lang=python3
#
# [303] Range Sum Query - Immutable
#

# @lc code=start
class NumArray:

    def __init__(self, nums: []):
        self.nums = nums

    def sumRange(self, i: int, j: int) -> int:
        if j > len(self.nums)-1: return 0
        return sum(self.nums[i:j+1])


# Your NumArray object will be instantiated and called as such:
# obj = NumArray([-2,0,3,-5,2,-1])
# param_1 = obj.sumRange(0,2)
# print(param_1)
# @lc code=end

