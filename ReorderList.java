public class ReorderList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public void execute(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;
        ListNode prev = null;
        ListNode curr = mid;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode head2 = prev;
        ListNode head1 = head;
        while(head2.next != null){
            ListNode nextHead1 = head1.next;
            ListNode nextHead2 = head2.next;

            head1.next = head2;
            head2.next = nextHead1;

            head1 = nextHead1;
            head2 = nextHead2;
        }
    }
}
