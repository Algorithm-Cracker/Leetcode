//ry

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length == 0) return res;
        helper(nums, new HashSet<>(), new ArrayList<>());
        return res;
    }
    
    private void helper(int[] nums, HashSet<Integer> set, List<Integer> list) {
        if(list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) continue;
            set.add(nums[i]);
            list.add(nums[i]);
            helper(nums, set, list);
            list.remove(list.size() - 1);
            set.remove(new Integer(nums[i]));
        }
    }
}
