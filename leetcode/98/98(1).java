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
        return isValidBSTRecurse(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean isValidBSTRecurse(TreeNode currNode, long lower, long upper) {
        if (currNode == null) return true;
        if (currNode.val >= upper) return false;
        if (currNode.val <= lower) return false;
        if ( ! isValidBSTRecurse(currNode.left, lower, currNode.val) ) return false;
        if ( ! isValidBSTRecurse(currNode.right, currNode.val, upper) ) return false;
        return true;
    } 
}
