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
    static int arr[]=new int[100000];
    public boolean isPalindrome(ListNode head) {
        int i=0,j=0;
        while(head!=null){
          arr[i++]=head.val;
            head=head.next;
        }
        while(i>0){
            if(arr[j++]!=arr[--i]){
                return false;
            }
        }
        return true;
    }
}