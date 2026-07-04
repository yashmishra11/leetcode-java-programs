class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val-b.val);

        for (ListNode n : lists)
        if (n!=null)
            pq.offer(n);

            ListNode d = new ListNode(), c = d;
            while (!pq.isEmpty()){
                ListNode t = pq.poll();
                c.next = t;
                c = c.next;

                if (t.next !=null)
                pq.offer(t.next);
            }
            return d.next;
    }
}
