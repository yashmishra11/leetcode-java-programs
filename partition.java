class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0), large = new ListNode(0); 
        ListNode a = small, b = large;

        while(head != null){
            if(head.val < x){
                a.next = head;
                a = a.next;
            }else{
                b.next = head;
                b = b.next;
            }
            head = head.next;
        }
        b.next = null;
        a.next = large.next;
        return small.next;
    }
}
