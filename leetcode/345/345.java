//ry

class Solution {
    public String reverseVowels(String s) {
        List<Character> list_char = new ArrayList<>();
        List<Integer> list_index = new ArrayList<>();
        char[] s_arr = s.toCharArray();
        int len = s_arr.length;
        for(int i = 0; i < len; i++) {
            if(s_arr[i] == 'a' || s_arr[i] == 'e' || s_arr[i] == 'i' || s_arr[i] == 'o' || s_arr[i] == 'u' || s_arr[i] == 'A' || s_arr[i] == 'E' || s_arr[i] == 'I' || s_arr[i] == 'O' || s_arr[i] == 'U') {
                list_char.add(s_arr[i]);
                list_index.add(i);
            }
        }
        int len2 = list_char.size();
        for(int i = 0; i < len2; i++) {
            s_arr[list_index.get(i)] = list_char.get(len2 - i - 1);
        }
        return new String(s_arr);
    }
}
