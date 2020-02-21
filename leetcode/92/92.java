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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null) return head;
        if(m == n) return head;
        ListNode left = null;
        ListNode right = null;
        ListNode newl = null;
        ListNode newr = null;
        int i = 1;
        ListNode pre = null;
        ListNode now = head;
        ListNode nex = head.next;
        while(i <= n) {
            if(i == m) {
                left = pre;
                newl = now;
            }
            if(i > m) {
                if(i == n) {
                    right = nex;
                    newr = now;
                }
                now.next = pre;
            }
            pre = now;
            now = nex;
            nex = nex == null ? null : nex.next;
            i++;
        }
        if(m == 1) head = newr;
        else left.next = newr;
        newl.next = right;
        return head;
    }
}
