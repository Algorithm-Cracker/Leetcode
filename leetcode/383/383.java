//ry

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map_mag = new HashMap<>();
        HashMap<Character, Integer> map_ran = new HashMap<>();
        char[] ran = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();
        for(char a : ran) {
            map_ran.put(a, map_ran.getOrDefault(a, 0) + 1);
        }
        for(char a : mag) {
            map_mag.put(a, map_mag.getOrDefault(a, 0) + 1);
        }
        for(char a : map_ran.keySet()) {
            if(map_ran.get(a) > map_mag.getOrDefault(a, 0)) return false;
        }
        return true;
    }
}
