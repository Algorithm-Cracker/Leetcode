#
# @lc app=leetcode id=349 lang=python3
#
# [349] Intersection of Two Arrays
#

# @lc code=start
class Solution:
    def intersection(self, nums1: [], nums2: []) -> []:
        # * 直接转换成set计算交集

        return list(set(nums1).intersection(set(nums2)))
    def test(self):
        assert(self.intersection([1,2,2,1], [2,2]) == [2])
        assert(self.intersection([4,9,5], [9,4,9,8,4]) == [9,4])

sol = Solution()
sol.test()
# @lc code=end

