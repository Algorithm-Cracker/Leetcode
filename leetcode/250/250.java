//ry

class Solution {
    int res = 0;
    public int countUnivalSubtrees(TreeNode root) {
        helper(root);
        return res;
    }
    private boolean helper(TreeNode node){
        if(node == null){
            return true;
        }
        if(helper(node.left) && helper(node.right)){
            if(node.left != null && node.left.val != node.val) return false;
            if(node.right != null && node.right.val != node.val) return false;
            res++;
            return true;
        }
        return false;
    }
}
