#
# @lc app=leetcode id=367 lang=python3
#
# [367] Valid Perfect Square
#

# @lc code=start
class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        # * 数学公式 1+3+5+......+(2n-1)=n*n
        
        sum = 0
        idx = 1
        while(sum < num):
            sum += idx
            idx += 2
        
        return sum == num
        
    def test(self):
        assert(self.isPerfectSquare(14) == False)
        assert(self.isPerfectSquare(16) == True)

sol = Solution()
sol.test()
# @lc code=end

