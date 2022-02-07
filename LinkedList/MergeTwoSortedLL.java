/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        if(A==null){
            return B;
        }
        if(B==null){
            return A;
        }
        ListNode ans= new ListNode(0);
        ListNode head= ans;
        //head.next=ans;

        ListNode x=A;
        ListNode y=B;

        while(x!=null && y!=null){
                if(x.val<y.val){
                    ans.next=x;
                    x=x.next;
                }
                else{
                    ans.next=y;
                    y=y.next;
                }
                ans=ans.next;
        }

        while(x!=null){
            ans.next=x;
            x=x.next;
            ans=ans.next;
        }
        while(y!=null){
            ans.next=y;
            y=y.next;
            ans=ans.next;
        }
        return head.next;
    }
}
