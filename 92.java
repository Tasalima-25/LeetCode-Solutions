/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        //if there is only one node or nothing to reverse
        if (head == null || left == right) {
            return head;
        }

        //dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        //prev stop before left
        ListNode prev = dummy;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // curr is the first node of the part to reverse
        ListNode curr = prev.next;

        //reverse nodes one by one
        for (int i = 0; i < right - left; i++) {

            ListNode next = curr.next;

            curr.next = next.next;

            next.next = prev.next;

            prev.next = next;
        }

        return dummy.next;
    }
}