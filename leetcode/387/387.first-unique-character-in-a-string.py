#
# @lc app=leetcode id=387 lang=python3
#
# [387] First Unique Character in a String
#

# @lc code=start
class Solution:
    def firstUniqChar(self, s: str) -> int:
        if not s: return -1
        
        for i, c in enumerate(s):
            if s.count(c) < 2:
                return i
        return -1
#     def test(self):
#         assert(self.firstUniqChar("leetcode") == 0)
#         assert(self.firstUniqChar('loveleetcode') == 2)
# sol = Solution()
# sol.test()

# @lc code=end

