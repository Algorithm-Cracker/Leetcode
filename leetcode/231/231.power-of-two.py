#
# @lc app=leetcode id=231 lang=python3
#
# [231] Power of Two
#

# @lc code=start
class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        # 每次向下除2, 看最后的结果
        if n < 1: return False
        elif n == 1: return True
        return self.isPowerOfTwo(n/2)
        
    def test(self):
        assert(self.isPowerOfTwo(1)==True)
        assert(self.isPowerOfTwo(16)==True)
        assert(self.isPowerOfTwo(218)==False)

sol = Solution()
sol.test()
# @lc code=end

