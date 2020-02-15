//ry

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        helper(nums, 0, new ArrayList<>());
        return res;
    }
    private void helper(int[] nums, int now, List<Integer> list) {
        if(list.size() <= nums.length) res.add(new ArrayList<>(list));
        for(int i = now; i < nums.length; i++) {
            list.add(nums[i]);
            helper(nums, i + 1, list);
            list.remove(list.size() - 1);
        }
    }
}
