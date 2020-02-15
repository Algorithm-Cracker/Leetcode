//ry

class Solution {
    public void sortColors(int[] nums) {
        int[] colors = new int[3];
        for(int i = 0; i < nums.length; i++) colors[nums[i]]++;
        int j = 0;
        while(j < nums.length) {
            if(colors[0]-- > 0) nums[j++] = 0;
            else if(colors[1]-- > 0) nums[j++] = 1;
            else nums[j++] = 2;
        }
    }
}
