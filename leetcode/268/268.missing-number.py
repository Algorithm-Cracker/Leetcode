#
# @lc app=leetcode id=268 lang=python3
#
# [268] Missing Number
#

# @lc code=start
class Solution:
    def missingNumber(self, nums: []) -> int:
        
        # 根据长度n用递推公式求nums的理论总和，然后减去nums的实际总和
        if len(nums) not in nums: return len(nums)

        expect = (len(nums)+1)*(0+len(nums))/2
        return int(expect - sum(nums))
    
    def test(self):
        assert(self.missingNumber([3,0,1]) == 2)
        assert(self.missingNumber([9,6,4,2,3,5,7,0,1]) == 8)
sol = Solution()
sol.test()
# @lc code=end

