//ry

class Solution {
    public boolean isSubsequence(String s, String t) {
        for (int i=0; i<s.length(); i++) {
            int index = t.indexOf(s.charAt(i));
            if (index >= 0) t = t.substring(index+1);
            else return false;
        }
        return true;
    }
}
