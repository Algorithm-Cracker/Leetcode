//ry

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        helper(nums, 0, new ArrayList<>());
        return res;
    }
    private void helper(int[] nums, int now, List<Integer> list) {
        if(list.size() <= nums.length) res.add(new ArrayList<>(list));
        for(int i = now; i < nums.length; i++) {
            list.add(nums[i]);
            helper(nums, i + 1, list);
            list.remove(list.size() - 1);
            while(i + 1 < nums.length && nums[i + 1] == nums[i]) i++;
        }
    }
}
