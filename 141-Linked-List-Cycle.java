/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(slow!=null && slow.next!=null){
            fast=fast.next;
            slow=slow.next.next;
            if(fast==slow){
                return true;
            }
           
        }
         return false;
    }
}