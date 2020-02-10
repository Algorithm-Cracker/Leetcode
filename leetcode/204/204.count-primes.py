#
# @lc app=leetcode id=204 lang=python3
#
# [204] Count Primes
#

# @lc code=start
class Solution:
    def countPrimes(self, n: int) -> int:
        # 埃氏筛法
        if n <= 2: return 0
        res = [True] * n
        res[0] = res[1] = False
        for i in range(2, n):
            if res[i] == True:
                for j in range(2, (n-1)//i+1):
                    res[i*j] = False
        return sum(res)

    def test(self):
        assert(self.countPrimes(10) == 4)
        print(self.countPrimes(499979))

sol = Solution()
sol.test()

# @lc code=end

