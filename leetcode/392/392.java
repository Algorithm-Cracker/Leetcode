//ry

class Solution {
    public boolean isSubsequence(String s, String t) {
        int len_t = t.length();
        char[] t_arr = t.toCharArray();
        int i = -1;
        for(char a : s.toCharArray()) {
            if(i == len_t) return false;
            i++;
            while(i < len_t) {
                if(a == t_arr[i]) break;
                i++;
            }
        }
        if(i == len_t) return false;
        return true;
    }
}
