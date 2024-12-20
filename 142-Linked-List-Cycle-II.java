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
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(slow!=null && slow.next!=null){
            slow=slow.next.next;
            fast=fast.next;
            
            if(slow==fast){
                ListNode pos1=head;
                ListNode pos2=slow;
                while(pos1!=pos2){
                    pos1=pos1.next;
                    pos2=pos2.next;
                }
                return pos1;
            
            }
        }
         return null;
    }
}