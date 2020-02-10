//ry

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if(candidates.length == 0) return res;
        Arrays.sort(candidates);
        helper(0, 0, candidates, target, new ArrayList<>());
        return res;
    }
    private void helper(int sum, int now, int[] nums, int target, List<Integer> list) {
        if(sum > target) return;
        if(sum == target) {
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = now; i < nums.length;) {
            list.add(nums[i]);
            helper(sum + nums[i], i + 1, nums, target, list);
            list.remove(list.size() - 1);
            i++;
            while (i < nums.length && nums[i] == nums[i - 1]) i++;
        }
    }
}
