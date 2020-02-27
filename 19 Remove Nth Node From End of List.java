/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return null;
        ListNode p = head;
        //calculate length
        int len = 0;
        while(p!=null){
            len ++;
            p = p.next;
        }
        //if remove the first node
        int start = len - n + 1;
        if(start == 1){
            return head.next;
        }
        //if remove non-first node
        int i =0;
        p = head;
        while(p!=null){
            if(i == start -1){
                i++;
                p.next = p.next.next;
            }
            p=p.next;
        }
        
        return head;
    }
}