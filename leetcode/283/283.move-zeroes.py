#
# @lc app=leetcode id=283 lang=python3
#
# [283] Move Zeroes
#

# @lc code=start
class Solution:
    def moveZeroes(self, nums: []) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # 每次移动最左边的0

        # 记录最左边的0的位置
        pos = 0
        for i in range(len(nums)):
            if nums[i] != 0:
                # 将value与最左边的0进行交换
                nums[i], nums[pos] = nums[pos], nums[i]
                pos += 1
# @lc code=end

