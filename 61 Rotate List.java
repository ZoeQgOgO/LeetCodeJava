class Solution {
    public ListNode rotateRight(ListNode head, int k){
        if(head != null){
            ListNode temp = head;
            int count = 0;
            while(temp != null){
                temp = temp.next;
                count ++;
            }
            if(k >= count){
                k = k % count;
            }
            if(k > 0){
                ListNode fast = head;
                ListNode slow = head;
                while (k > 0){
                    fast = fast.next;
                    k--;
                }
                while(fast.next != null){
                    slow = slow.next;
                    fast = fast.next;
                }
                temp = slow.next;
                slow.next = null;
                fast.next = head;
                return temp;
            }
        }
        return head;
    }
}