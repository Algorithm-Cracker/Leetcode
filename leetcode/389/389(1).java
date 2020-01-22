//ry

//sort

class Solution {
    public char findTheDifference(String s, String t) {
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        Arrays.sort(s_arr);
        Arrays.sort(t_arr);
        for(int i = 0; i < s_arr.length; i++) {
            if(s_arr[i] != t_arr[i]) return t_arr[i];
        }
        return t_arr[t_arr.length - 1];
    }
}
