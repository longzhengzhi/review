package believe;

public class smallequalbigList {


    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(5);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(2);
        ListNode quee = quee(head, 3);
        System.out.println("==========");
        while (quee!=null){
            System.out.print(quee.val+" ");
            quee = quee.next;
        }
    }


    public static ListNode quee(ListNode node,int pivot){
        ListNode sH = null;
        ListNode sT = null;
        ListNode eH = null;
        ListNode eT = null;
        ListNode bH = null;
        ListNode bT = null;
        ListNode next = null;

        while (node!=null){
            next = node.next;
            node.next = null;
            if (node.val<pivot){
                if (sH==null){
                    sH = node;
                    sT = node;
                }else {
                    sT.next = node;
                    sT = node;
                }
            }else if (node.val==pivot){
                if (eH==null){
                    eH = node;
                    eT = node;
                }else {
                    eT.next = node;
                    eT = node;
                }
            }else {
                if (bH==null){
                    bH = node;
                    bT = node;
                }else {
                    bT.next = node;
                    bT = node;
                }
            }
            node = next;
        }
        if (sT!=null){
            sT.next =  eH;
            eT = eT==null?sT:eT;
        }
        if (eT!=null){
            eT.next = bH;
        }
        return sH!=null?sH:eH!=null?eH:bH;
    }

}
