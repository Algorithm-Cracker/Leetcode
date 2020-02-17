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
    public ListNode partition(ListNode head, int x) {
        if(head == null) return head;
        ListNode pre = new ListNode(-1);
        pre.next = head;
        head = pre;
        pre = null;
        ListNode bef = head;
        ListNode aft = null;
        ListNode search = head.next;
        while(search != null) {
            if(search.val < x) {
                bef.next = search;
                bef = bef.next;
            }
            else {
                if(aft == null) {
                    aft = search;
                    pre = search;
                }
                else {
                    aft.next = search;
                    aft = aft.next;
                }
            }
            search = search.next;
        }
        if(aft != null) aft.next = null;
        bef.next = pre;
        return head.next;
    }
}
