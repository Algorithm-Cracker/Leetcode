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
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        ListNode prere = null;
        ListNode pre = head;
        ListNode nex = head.next;
        if(nex == null) return head;
        head = nex;
        while(true) {
            pre.next = nex.next;
            nex.next = pre;
            if(prere != null) prere.next = nex;
            prere = pre;
            pre = pre.next;
            if(pre == null) break;
            nex = pre.next;
            if(nex == null) break;
        }
        return head;
    }
}
