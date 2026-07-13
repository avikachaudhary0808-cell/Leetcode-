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
    public ListNode swapPairs(ListNode head) {

        // Dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while (prev.next != null && prev.next.next != null) {

            // First and second node of pair
            ListNode first = prev.next;
            ListNode second = first.next;


            // Swap nodes

            // Connect previous node to second
            prev.next = second;

            // First node goes after second
            first.next = second.next;

            // Second points to first
            second.next = first;


            // Move prev to next pair
            prev = first;
        }

        return dummy.next;
    }
}