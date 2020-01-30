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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = null;
        ListNode now = head;
        ListNode nex = head.next;
        if(nex == null) return null;
        while(nex != null) {
            now.next = pre;
            pre = now;
            now = nex;
            nex = nex.next;
        }
        now.next = pre;
        nex = pre;
        pre = null;
        int i = 1;
        while(nex != null) {
            if(i == n) {
                now = now.next;
                nex = nex.next;
                i++;
                continue;
            }
            now.next = pre;
            pre = now;
            now = nex;
            nex = nex.next;
            i++;
        }
        if(i == n) return pre;
        now.next = pre;
        return head;
    }
}
