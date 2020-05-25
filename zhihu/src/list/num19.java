public class num19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head.next == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode cur = head;



        for (int i = 0; i < n ; i++) {
            fast = fast.next;
        }

        if (fast!=null) {
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        if (fast!=null) {
            if (slow.next != null) {
                slow.next = slow.next.next;
            } else {
                return null;
            }

        }else {
            if (slow.next != null) {
                return slow.next;
            } else {
                return null;
            }
        }
        return cur;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
