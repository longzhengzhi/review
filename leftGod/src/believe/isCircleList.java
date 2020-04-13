package believe;

public class isCircleList {

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        head1.next.next.next.next.next = new ListNode(6);
        head1.next.next.next.next.next.next = new ListNode(7);
        head1.next.next.next.next.next.next.next = head1.next.next;

        ListNode head2 = new ListNode(9);
        head2.next = new ListNode(8);
        head2.next.next = head1.next.next.next.next.next;
        head2.next.next.next = head1.next.next.next.next.next.next;
        head2.next.next.next.next = head1.next.next;
        head2.next.next.next.next.next = head1.next.next.next;
        head2.next.next.next.next.next.next = head1.next.next.next.next;
        head2.next.next.next.next.next.next.next = head1.next.next.next.next.next;

        ListNode firstIntersectNode = getFirstIntersectNode(head1, head2);
        System.out.println(firstIntersectNode );

    }


    public static ListNode getFirstIntersectNode(ListNode head1, ListNode head2) {
        if (head1==null||head2==null){
            return null;
        }
        ListNode loop1 = getLoopNode(head1);    //两链表的入环结点loop1和loop2
        ListNode loop2 = getLoopNode(head2);

        //noloop
        if (loop1 == null && loop2 == null) {
            return noLoop(head1, head2);
        }

        //both loop
        if (loop1 != null && loop2 != null) {
            return bothLoop(head1, head2, loop1, loop2);
        }
        //don't intersect
        return null;


    }

    private static ListNode bothLoop(ListNode head1, ListNode head2, ListNode loop1, ListNode loop2) {
        ListNode cur1 = head1;
        ListNode cur2 = head2;

        int len1 = 0;
        int len2 = 0;
        if (loop1==loop2) {
            while (cur1.next != loop1) {
                len1++;
                cur1 = cur1.next;
            }
            while (cur2.next != loop2) {
                len2++;
                cur2 = cur2.next;
            }

            cur1 = head1;
            cur2 = head2;
            if (len2 > len1) {
                while (len2 - len1 != 0) {
                    cur1 = cur1.next;
                    len2--;
                }
            } else {
                while (len1 - len2 != 0) {
                    cur2 = cur2.next;
                    len1--;
                }
            }
            while (cur1 != cur2) {
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
            return cur1;

        }
        //相交点不在环上

        //相交点在环上
        cur1 = loop1.next;
        while (cur1!=loop1){
            if (cur1==loop2){
                return loop2;
            }
            cur1 = cur1.next;
        }
        return null;
    }

    private static ListNode noLoop(ListNode head1, ListNode head2) {
        ListNode cur1 = head1;
        ListNode cur2 = head2;
        int len1 = 0;
        ListNode end1 = null;
        int len2 = 0;
        ListNode end2 = null;
        while (cur1 != null) {
            len1++;
            end1 = cur1;
            cur1 = cur1.next;
        }
        while (cur2 != null) {
            len2++;
            end2 = cur2;
            cur2 = cur2.next;
        }
        if (end1 != end2) {
            return null;
        }
        cur1 = head1;
        cur2 = head2;
        if (len2 > len1) {
            while (len2 - len1 != 0) {
                cur1 = cur1.next;
                len2--;
            }
        } else {
            while (len1 - len2 != 0) {
                cur2 = cur2.next;
                len1--;
            }
        }
        while (cur1!=cur2){
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;
    }
    private static ListNode getLoopNode(ListNode head) {
        if (head==null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        do{
            slow = slow.next;
            if (fast.next==null||fast.next.next==null){
                return null;
            }else {
                fast = fast.next.next;
            }
        }while (fast!=slow);
        fast = head;
        while (fast==slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }


}
