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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode cur=head;
        List<Integer> ans=new LinkedList<>();
        if(left==right){
            return head;
        }
        ListNode temp=cur;
        while(cur!=null){
            ans.add(cur.val);
            cur=cur.next;
        }
        for(int i=0;i<left-1;i++){
            temp=temp.next;
        }
        for(int j=right-1;j>=left-1;j--){
            temp.val=ans.get(j);
            temp=temp.next;
        }
        return head;
    }
}