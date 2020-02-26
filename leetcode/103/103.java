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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Stack<TreeNode> s = null;
        Stack<TreeNode> s_help = new Stack<>();
        s_help.push(root);
        boolean flag = true;
        while(!s_help.isEmpty()) {
            s = s_help;
            s_help = new Stack<>();
            List<Integer> cmp = new ArrayList<>();
            if(flag) {
                while(!s.isEmpty()) {
                    TreeNode node = s.pop();
                    cmp.add(node.val);
                    if(node.left != null) s_help.push(node.left);
                    if(node.right != null) s_help.push(node.right);
                }
            }
            else {
                while(!s.isEmpty()) {
                    TreeNode node = s.pop();
                    cmp.add(node.val);
                    if(node.right != null) s_help.push(node.right);
                    if(node.left != null) s_help.push(node.left);
                }
            }
            flag = !flag;
            res.add(cmp);
        }
        return res;
    }
}
