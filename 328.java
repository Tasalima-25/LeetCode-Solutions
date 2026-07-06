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
    public ListNode oddEvenList(ListNode head) {

        
        if (head == null)   //if list is empty 
        {
            return null;
        }

        
        ListNode odd = head;    //odd starts from first node

        
        ListNode even = head.next;  //even starts from second node

        
        ListNode evenHead = even;   //save the head of even list

        
        while (even != null && even.next != null) //rearrange the list
        {

            //connect odd nodes
            odd.next = even.next;
            odd = odd.next;

            //connect even nodes
            even.next = odd.next;
            even = even.next;
        }

        //attach even list after odd list
        odd.next = evenHead;

        return head;
    }
}