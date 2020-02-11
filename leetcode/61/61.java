//ry

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        int num = 0;
        ListNode node = head;
        while(node != null) {
            num++;
            node = node.next;
        }
        k %= num;
        if(k == 0) return head;
        int tmp = num - k;
        ListNode pre = null;
        ListNode now = head;
        for(int i = 0; i < tmp; i++) {
            pre = now;
            now = now.next;
        }
        pre.next = null;
        ListNode inj = now;
        while(now.next != null) {
            now = now.next;
        }
        now.next = head;
        head = inj;
        return head;
    }
}
