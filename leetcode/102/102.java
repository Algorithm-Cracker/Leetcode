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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = null;
        Queue<TreeNode> q_help = new LinkedList<>();
        q_help.offer(root);
        while(!q_help.isEmpty()) {
            List<Integer> cmp = new ArrayList<>();
            q = q_help;
            q_help = new LinkedList<>();
            while(!q.isEmpty()) {
                TreeNode node = q.poll();
                cmp.add(node.val);
                if(node.left != null) q_help.offer(node.left);
                if(node.right != null) q_help.offer(node.right);
            }
            res.add(cmp);
        }
        return res;
    }
}
