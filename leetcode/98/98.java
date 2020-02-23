//ry

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        if(!helper_left(root.val, root.left)) return false;
        if(!helper_right(root.val, root.right)) return false;
        return true;
    }
    private boolean helper_left(int cmp, TreeNode node) {
        if(node == null) return true;
        if(node.val >= cmp) return false;
        if(!helper_left(node.val, node.left)) return false;
        if(!helper_left(cmp, node.right)) return false;
        if(!helper_right(node.val, node.right)) return false;
        return true;
    }
    private boolean helper_right(int cmp, TreeNode node) {
        if(node == null) return true;
        if(node.val <= cmp) return false;
        if(!helper_right(cmp, node.left)) return false;
        if(!helper_left(node.val, node.left)) return false;
        if(!helper_right(node.val, node.right)) return false;
        return true;
    }
}
