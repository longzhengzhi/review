public class num206 {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;

        while (head!=null){
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}
