#
# @lc app=leetcode id=242 lang=python3
#
# [242] Valid Anagram
#

# @lc code=start
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        alphabet = {}
        if len(s) != len(t): return False
        for c in s:
            if c not in alphabet: 
                alphabet[c] = 1
            else:
                alphabet[c] += 1
        
        for c in t:
            if c not in alphabet: 
                return False
            if alphabet[c] != t.count(c):
                return False
        return True
    
    def test(self):
        assert(self.isAnagram('anagram', 'nagaram') == True)
        assert(self.isAnagram('rat', 'car') == False)
sol = Solution()
sol.test()
# @lc code=end

