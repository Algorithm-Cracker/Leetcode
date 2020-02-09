//ry

class Solution {
    public boolean canJump(int[] nums) {
        int max = 1;
        int i = 0;
        for(; i < nums.length; i++) {
            max--;
            max = max >= nums[i] ? max : nums[i];
            if(max == 0) break;
        }
        if(i >= nums.length - 1) return true;
        else return false;
    }
}
