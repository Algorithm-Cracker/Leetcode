#
# @lc app=leetcode id=219 lang=python3
#
# [219] Contains Duplicate II
#

# @lc code=start
class Solution:
    def containsNearbyDuplicate(self, nums: [], k: int) -> bool:
        # 先判断有没有重复

        # 有重复的拿到重复的号码的

        numidx = {}
        dupnums = []
        for idx, num in enumerate(nums):
            if num not in numidx:
                numidx[num] = []
                numidx[num].append(idx)
            else:
                numidx[num].append(idx)
                if num not in dupnums: 
                    dupnums.append(num)
        
        # 重复的数字都在dupnums里
        # 对应的索引保存在numidx里
        # 求重复数字的索引之间的最小距离
        for dupnum in dupnums:
            dupidxs = numidx[dupnum]
            # 因为索引之间是排好序的. 
            # 比如 a, b, c
            # a-c的距离一定大于a-b和b-c
            # 所以只要比较相邻的两个数的距离即可
            for idx in range(1, len(dupidxs)):
                if k >= (dupidxs[idx] - dupidxs[idx-1]):
                    return True 
        return False
    def test(self):
        assert(self.containsNearbyDuplicate([1,2,3,1], 3) == True)
        assert(self.containsNearbyDuplicate([1,0,1,1], 1) == True)
        assert(self.containsNearbyDuplicate([1,2,3,1,2,3], 2) == False)

sol = Solution()
sol.test()

# @lc code=end

