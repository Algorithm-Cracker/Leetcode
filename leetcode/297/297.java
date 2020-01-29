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
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return null;
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        sb.append(root.val + ",");
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(node.left == null) sb.append("null,");
            else {
                sb.append(node.left.val + ",");
                queue.offer(node.left);
            }
            if(node.right == null) sb.append("null,");
            else {
                sb.append(node.right.val + ",");
                queue.offer(node.right);
            }
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == null) return null;
        String[] tmp = data.split(",");
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(new Integer(tmp[0]));
        queue.offer(root);
        int i = 1;
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(tmp[i].compareTo("null") == 0) {
                node.left = null;
                i++;
            }
            else {
                node.left = new TreeNode(new Integer(tmp[i++]));
                queue.offer(node.left);
            }
            if(tmp[i].compareTo("null") == 0) {
                node.right = null;
                i++;
            }
            else {
                node.right = new TreeNode(new Integer(tmp[i++]));
                queue.offer(node.right);
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
