//ry

class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) return new int[]{-1, -1};
        int index = helper(0, nums.length - 1, nums, target);
        if(nums[index] != target) return new int[]{-1, -1};
        int low = index;
        int high = index;
        while(low >= 0 && nums[low] == target) {
            low--;
        }
        while(high < nums.length && nums[high] == target){
            high++;
        }
        return new int[]{++low, --high};
    }
    private int helper(int low, int high, int[] nums, int target) {
        if(low == high) return low;
        int mid = low + (high - low) / 2;
        if(nums[mid] == target) return mid;
        else if(nums[mid] < target) return helper(mid + 1, high, nums, target);
        else return helper(low, mid, nums, target);
    }
}
