//ry

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lenx = matrix.length;
        if(lenx == 0) return false;
        int leny = matrix[0].length;
        if(leny == 0) return false;
        int x = 1;
        for(; x < lenx; x++) {
            if(matrix[x][0] > target) break;
        }
        x--;
        return binarysearch(matrix[x], 0, leny - 1, target);
    }
    
    private boolean binarysearch(int[] nums, int low, int high, int target) {
        int mid = low + (high - low) / 2;
        if(nums[mid] == target) return true;
        if(low == high) return false;
        if(nums[mid] > target) return binarysearch(nums, low, mid, target);
        else return binarysearch(nums, mid + 1, high, target);
    }
}
