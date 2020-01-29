//ry

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for(int i = 0; i < height.length; i++) {
            for(int j = i + 1; j < height.length; j++) {
                int water = (j - i) * (height[i] <= height[j] ? height[i] : height[j]);
                max = max >= water ? max : water;
            }
        }
        return max;
    }
}

//some restrictions

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int len = height.length;
        for(int i = 0; i < len; i++) {
            if(height[i] * (len - i) < max) continue;
            for(int j = i + 1; j < len; j++) {
                int water = (j - i) * (height[i] <= height[j] ? height[i] : height[j]);
                max = max >= water ? max : water;
            }
        }
        return max;
    }
}
