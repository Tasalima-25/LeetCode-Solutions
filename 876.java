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
    public ListNode middleNode(ListNode head) {

        // Both pointers start from the head
        ListNode node1 = head;
        ListNode node2 = head;

        // Move slow by 1 step and fast by 2 steps
        while (node2 != null && node2.next != null) {
            node1 = node1.next;
            node2 = node2.next.next;
        }

        // Slow will be at the middle node
        return node1;
    }
}