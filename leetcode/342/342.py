#
# @lc app=leetcode id=342 lang=python3
#
# [342] Power of Four
#

# @lc code=start
class Solution:
    def isPowerOfFour(self, num: int) -> bool:
        if num == 0: return False

        result = False
        while(num):
            if num == 1:
                result = True
                break
            elif num<1: break
            elif num>1:
                num = num / 4

        return result

    def test(self):
        assert(self.isPowerOfFour(16) == True)
        assert(self.isPowerOfFour(5) == False)

sol = Solution()
sol.test()

# @lc code=end

