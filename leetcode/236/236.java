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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == p || root == q) return root;
        boolean ip = iscontained(root.left, p);
        boolean iq = iscontained(root.right, q);
        if((ip && iq) || (!ip && !iq)) return root;
        else if(ip && !iq ) return lowestCommonAncestor(root.left, p, q);
        else return lowestCommonAncestor(root.right, p, q);
    }
    public boolean iscontained(TreeNode root, TreeNode node) {
        if(root == null) return false;
        if(root == node) return true;
        if(iscontained(root.left, node)) return true;
        if(iscontained(root.right, node)) return true;
        return false;
    }
}
