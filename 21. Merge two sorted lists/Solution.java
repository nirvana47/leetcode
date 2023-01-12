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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode result = new ListNode(0);
        ListNode last = result;
        ListNode l1 = list1;
        ListNode l2 = list2;

        while(l1 != null && l2 != null) {
            if(l1.val <= l2. val) {
                last.next = l1; 
                l1 = l1.next;
            }
            else {
                last.next = l2;
                l2 = l2.next;
            }
            last = last.next; 
        }

        if(l1 == null) {
            last.next = l2;
        }
        if(l2 == null) {
            last.next = l1;
        }
        
        return result.next;
    }
}
