#
# @lc app=leetcode id=404 lang=python3
#
# [404] Sum of Left Leaves
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def sumOfLeftLeaves(self, root: TreeNode) -> int:
        # 维护一个队列, 里面是没有遍历完左右子节点的节点
        # 如果左节点存在, 把左节点存入队列
        # 如果右节点存在, 把右节点存入队列
        # 如果该节点的左右节点都已经遍历, 将改节点抛出
        # 如果该节点的左节点为None, 即为左叶子节点. 累积该值
        if not root: return 0
        
        from collections import deque
        queue = deque()
        queue.append(root)
        left_queue = []

        result = 0
        while(queue):
            currNode = queue.popleft()
            if currNode.left:
                queue.append(currNode.left)
                left_queue.append(currNode.left)
            elif not currNode.left and currNode in left_queue and not currNode.right:
                result += currNode.val

            if currNode.right:
                queue.append(currNode.right)
        
        return result
# @lc code=end

