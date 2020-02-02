#
# @lc app=leetcode id=345 lang=python3
#
# [345] Reverse Vowels of a String
#

# @lc code=start
class Solution:
    def reverseVowels(self, s: str) -> str:
        # * 将所有的元音字母找出来, 然后反序, 然后重新替换回字符串里即可

        vowels = ('a', 'e', 'i', 'o', 'u')
        
        # * 找到所有的元音字母
        found = []
        for c in s:
            if c.lower() in vowels:
                found.append(c)
        
        # * 反序
        # reverse_found = reversed(found)

        # * 重新替换回字符串里
        new_str = ''
        for c in s:
            if c.lower() not in vowels:
                new_str += c
                continue
            # * 找到元音
            if found:
                new_str += found.pop()
        return new_str
        
    def test(self):
        assert(self.reverseVowels('hello') == 'holle')
        assert(self.reverseVowels('leetcode') == 'leotcede')
        assert(self.reverseVowels('y') == 'y')
        assert(self.reverseVowels('test') == 'test')

sol = Solution()
sol.test()
# @lc code=end

