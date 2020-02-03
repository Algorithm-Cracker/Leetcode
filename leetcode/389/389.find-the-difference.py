#
# @lc app=leetcode id=389 lang=python3
#
# [389] Find the Difference
#

# @lc code=start
class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        # * 找到多余的字母
        s_sum = sum(map(ord, s))
        t_sum = sum(map(ord, t))
        return chr(t_sum - s_sum)
    
    def test(self):
        assert(self.findTheDifference("abcd", "abcde") == 'e')

sol = Solution()
sol.test()
# @lc code=end

