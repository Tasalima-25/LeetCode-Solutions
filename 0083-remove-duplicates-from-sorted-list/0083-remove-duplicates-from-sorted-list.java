/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        // If list is empty
        if (head == null) {
            return null;
        }

        ListNode current = head;

        while (current != null && current.next != null) {

            // Duplicate found
            if (current.val == current.next.val) {
                current.next = current.next.next;
            }
            // Move to next node
            else {
                current = current.next;
            }
        }

        return head;
    }
}