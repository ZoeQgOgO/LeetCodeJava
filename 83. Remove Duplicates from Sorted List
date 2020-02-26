/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        while(p != null){
            while(p != null && p.next != null && p.val == p.next.val){
                p.next= p.next.next;
            }
            p =p.next;
        }
        return head;
    }
}