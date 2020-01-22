//ry

class Solution {
    public char findTheDifference(String s, String t) {
        int[] ch = new int[26];
        for(char a : t.toCharArray()) {
            ch[a - 'a'] ++;
        }
        for(char a : s.toCharArray()) {
            ch[a - 'a'] --;
        }
        for(int i = 0; i < 26; i++) {
            if(ch[i] == 1) return (char)('a' + i);
        }
        return 'a';
    }
}
