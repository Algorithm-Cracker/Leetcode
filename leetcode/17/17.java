//ry

class Solution {
    Map<String, String> phone = new HashMap<String, String>() {{
    put("2", "abc");
    put("3", "def");
    put("4", "ghi");
    put("5", "jkl");
    put("6", "mno");
    put("7", "pqrs");
    put("8", "tuv");
    put("9", "wxyz");
  }};
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if(digits.length() == 0) return res;
        int i = 0;
        helper(new StringBuilder(), digits, i, res);
        return res;
    }
    private void helper(StringBuilder sb, String digits, int i, List<String> res) {
        char[] tmp = phone.get(digits.substring(i, ++i)).toCharArray();
        if(!(i < digits.length())) { 
            for(char a : tmp) {
                sb.append(a);
                res.add(sb.toString());
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        else { 
            for(char a : tmp) {
                sb.append(a);
                helper(sb, digits, i, res);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}
