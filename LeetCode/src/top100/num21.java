package top100;

public class num21 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        l1.next = l11;
        l11.next = l12;
        ListNode l2 = new ListNode(1);
        ListNode l21 = new ListNode(3);
        ListNode l22 = new ListNode(4);
        l2.next = l21;
        l21.next = l22;
        ListNode listNode = mergeTwoLists(l1, l2);
        while (listNode.next!=null){
            System.out.print(listNode.val);
            listNode = listNode.next;
        }

    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1==null){
            return l2;
        }else if (l2==null){
            return l1;
        }else {
            if (l1.val<l2.val){
                l1.next = mergeTwoLists(l1.next,l2);
                return l1;
            }else {
                l2.next = mergeTwoLists(l1,l2.next);
                return l2;
            }
        }



    }


}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}