#
# @lc app=leetcode id=374 lang=python3
#
# [374] Guess Number Higher or Lower
#

# @lc code=start
# The guess API is already defined for you.
# @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
# def guess(num: int) -> int:

class Solution:
    def guessNumber(self, n: int) -> int:
        # * 二分法找数字

        return int(self.binaryGuess(1, n))
    def binaryGuess(self, left, right):

        mid = (left + right) / 2
        res = guess(mid)
        if res == 0:
            return mid
        elif res == 1:
            # 说明数字比mid大
            left = mid + 1
            return self.binaryGuess(left, right)
        elif res == -1:
            # 说明数字比mid小
            right = mid - 1
            return self.binaryGuess(left, right)
    
# @lc code=end

