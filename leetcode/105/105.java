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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = preorder.length;
        if(len == 0) return null;
        TreeNode root = new TreeNode(preorder[0]);
        int index = 0;
        for(int i = 0; i < len; i++) {
            if(inorder[i] == preorder[0]) {
                index = i;
                break;
            }
        }
        helper(root, 0, index, preorder, inorder, len, len);
        return root;
    }
    private void helper(TreeNode node, int i1, int i2, int[] n1, int[] n2, int len, int rlen) {
        if(i1 >= len - 1) return;
        int il1 = -1;
        int il2 = -1;
        int ir1 = -1;
        int ir2 = -1;
        for(int i = 0; i < i2; i++) {
            if(n2[i] == n1[i1 + 1]) {
                il1 = i1 + 1;
                il2 = i;
                break;
            }
        }
        for(int i = i1 + 1; i < len; i++) {
            for(int j = i2 + 1; j < rlen; j++) {
                if(n1[i] == n2[j]) {
                    ir1 = i;
                    ir2 = j;
                    break;
                }
            }
            if(ir1 != -1) break;
        }
        if(il1 != -1) {
            node.left = new TreeNode(n1[il1]);
            helper(node.left, il1, il2, n1, n2, len, i2 + 1);
        }
        if(ir1 != -1) {
            node.right = new TreeNode(n1[ir1]);
            helper(node.right, ir1, ir2, n1, n2, len, rlen);
        }
    }
}
