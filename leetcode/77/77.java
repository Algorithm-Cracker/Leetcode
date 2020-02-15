//ry

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        if(k == 0 || n < k) return res;
        helper(n, k, 0, 0, new ArrayList<>());
        return res;
    }
    private void helper(int n, int k, int now, int len, List<Integer> list) {
        if(len == k) {
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = now + 1; i <= n; i++) {
            list.add(i);
            helper(n, k, i, len + 1, list);
            list.remove(list.size() - 1);
        }
    }
}
