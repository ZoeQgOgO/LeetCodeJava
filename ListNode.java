

 public class ListNode {
     int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        Integer carry = 0;
        
        while(l1 != null || l2 != null || carry==1){
            Integer val1 = 0;
            Integer val2 = 0;
            if(l1 !=null){
                val1 = l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                val2 = l2.val;
                l2 = l2.next;
            }
            Integer sum = val1 + val2 + carry;
            if(sum < 10){
                cur.next = new ListNode(sum);
                cur = cur.next;
                carry = 0;
            }else{
                cur.next = new ListNode(sum % 10);
                cur = cur.next;
                carry =1;
            }
        }
        return head.next;
    }
}