//ry

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates.length == 0) return res;
        helper(0, 0, candidates, target, new ArrayList<>());
        return res;
    }
    private void helper(int sum, int now, int[] nums, int target, List<Integer> list) {
        if(sum > target) return;
        if(sum == target) {
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = now; i < nums.length; i++) {
            list.add(nums[i]);
            helper(sum + nums[i], i, nums, target, list);
            list.remove(list.size() - 1);
        }
    }
}
