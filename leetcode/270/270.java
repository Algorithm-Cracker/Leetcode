//ry

class Solution {
    public int closetValue(TreeNode root, double target) {
        int res = root.val;
        while (root != null) {
            if (Math.abs(res - target) >= Math.abs(root.val - target)) {
                res = root.val;
            }
            root = target < root.val ? root.left : root.right;
        }
        return res;
    }
}
