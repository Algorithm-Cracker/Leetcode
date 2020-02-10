#
# @lc app=leetcode id=202 lang=python3
#
# [202] Happy Number
#

# @lc code=start
class Solution:
    def isHappy(self, n: int) -> bool:
        # 硬刚
        total = set()
        while (n != 1):
            result = sum([int(num)**2 for num in str(n)])
            if result in total:
                return False
            else:
                total.add(result)
            
            n = result
        else:
            return True
    
    def test(self):
        assert(self.isHappy(19) == True)

sol = Solution()
sol.test()
# @lc code=end

