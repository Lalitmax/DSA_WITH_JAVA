
 class reverse_Nodes_in_k_group {
   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
  
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode newHead = head;
        ListNode curr = newHead;
        ListNode temp = null;
        ListNode pre = null;

        int count = 0;
        
        // Check if there are at least k nodes remaining
        ListNode checkNext = head;
        for (int i = 0; i < k; i++) {
            if (checkNext == null) {
                return head; // Less than k nodes remaining, no need to reverse
            }
            checkNext = checkNext.next;
        }

        while (k > 0) {
            temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
            k--;
            count++;
        }

        if (count > 0) {
            newHead.next = reverseKGroup(curr, count); // Connect the reversed group to the next group
        }

        return pre;
    }
}
