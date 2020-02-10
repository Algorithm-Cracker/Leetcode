//ry

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap();
        int[] arr = new int[26];
        for(String str : strs) {
            Arrays.fill(arr, 0);
            for(char c : str.toCharArray()) arr[c - 'a'] ++;
            StringBuilder sb = new StringBuilder();
            for(int a : arr) sb.append('#' + a);
            String Key = sb.toString();
            if(!map.containsKey(Key)) map.put(Key, new ArrayList<>());
            map.get(Key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
