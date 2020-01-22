//ry

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] mag = new int[26];
        for(char m : magazine.toCharArray()) {
            mag[m - 'a'] ++;
        }
        for(char m : ransomNote.toCharArray()) {
            if(mag[m - 'a'] == 0) return false;
            mag[m - 'a'] --;
        }
        return true;
    }
}
