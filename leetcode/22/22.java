//ry

class Solution {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        helper(0, 0, n, new StringBuilder());
        return res;
    }
    private void helper(int left, int right, int n, StringBuilder sb) {
        if(left == n && right == n) {
            res.add(sb.toString());
            return;
        }
        if(left < n) {
            sb.append("(");
            helper(left + 1, right, n, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(right < n && left > right) {
            sb.append(")");
            helper(left, right + 1, n, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
