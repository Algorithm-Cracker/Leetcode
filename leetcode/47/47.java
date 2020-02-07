//ry

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 0) return res;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        helper(nums, map, new ArrayList<>());
        return res;
    }
    
    private void helper(int[] nums, HashMap<Integer, Integer> map, List<Integer> list) {
        if(list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < nums.length;) {
            if(map.get(nums[i]) == 0) {
                i++;
                continue;
            }
            map.put(nums[i], map.get(nums[i]) - 1);
            list.add(nums[i]);
            helper(nums, map, list);
            list.remove(list.size() - 1);
            map.put(nums[i], map.get(nums[i]) + 1);
            i++;
            while(i < nums.length && nums[i] == nums[i - 1]) i++;
        }
    }
}
    
    
