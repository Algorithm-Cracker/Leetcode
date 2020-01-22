//ry

class NumArray {

    private int[] sum;
    private int[] num;
    private int flag;

    public NumArray(int[] nums) {
        sum = new int[nums.length + 1];
        num = nums;
        flag = -1;
    }

    public int sumRange(int i, int j) {
        if(flag < j) {
            for (int k = flag + 1; k < num.length; k++) {
            sum[k + 1] = sum[k] + num[k];
            }
            flag = j;
        }
        return sum[j + 1] - sum[i];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
