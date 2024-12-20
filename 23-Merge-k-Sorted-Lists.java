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
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists == null || lists.length == 0){
            return null;
        }
        return MergeListHelper(lists,0,lists.length-1);
    }
    public ListNode MergeListHelper(ListNode[] list,int st,int end){
        if(st==end){
            return list[st];
        }
        if(st+1==end){
            return MergeTwoLists(list[st],list[end]);
        }
        int mid=st+(end-st)/2;
        ListNode leftMerge=MergeListHelper(list,st,mid);
        ListNode rightMerge=MergeListHelper(list,mid+1,end);
        return MergeTwoLists(leftMerge,rightMerge);
    }
    private ListNode MergeTwoLists(ListNode l1, ListNode l2){
        ListNode dumhead=new ListNode(0);
        ListNode cur=dumhead;
        while(l1!=null && l2!=null){
            if(l1.val < l2.val){
                cur.next=l1;
                l1=l1.next;
            }
            else{
                cur.next=l2;
                l2=l2.next;
            }
            cur=cur.next;
        }
        cur.next=(l1!=null)?l1:l2;
        return dumhead.next;
    }
}