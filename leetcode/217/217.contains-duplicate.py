#
# @lc app=leetcode id=217 lang=python3
#
# [217] Contains Duplicate
#

# @lc code=start
class Solution:
    def containsDuplicate(self, nums: []) -> bool:
        if not nums: return False

        return len(set(nums)) != len(nums)
    def test(self):
        assert(self.containsDuplicate([1,1,1,3,3,4,3,2,4,2]))

sol = Solution()
sol.test()
# @lc code=end

