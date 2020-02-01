#
# @lc app=leetcode id=263 lang=python3
#
# [263] Ugly Number
#

# @lc code=start
class Solution:
    def isUgly(self, num: int) -> bool:
        if num < 0: return False
        if num == 1: return True

        ugly_prime = (2,3,5)
        if num in ugly_prime: return True
        while(num):
            if int(num / 2) *2 == num:
                num = num / 2
            elif int(num / 3) *3 == num:
                num = num / 3
            elif int(num / 5) *5 == num:
                num = num / 5
            else:
                return False
            if num in ugly_prime:
                return True
        
        return False
    def test(self):
        assert(self.isUgly(6) == True)
        assert(self.isUgly(8) == True)
        assert(self.isUgly(14) == False)
        assert(self.isUgly(-6) == False)
        assert(self.isUgly(-8) == False)
        assert(self.isUgly(-14) == False)
        assert(self.isUgly(0) == False)
        assert(self.isUgly(-1) == False)
        assert(self.isUgly(1) == True)

sol = Solution()
sol.test()
# @lc code=end

