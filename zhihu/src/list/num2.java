public class num2 {



    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode cur = new ListNode(0);
        ListNode pre = cur;
        int bar = 0;
        while (l1!=null||l2!=null){
            int x = l1==null?0:l1.val;
            int y = l2==null?0:l2.val;

            int sum = x+y+bar;
            bar = sum>9?1:0;
            sum = sum>9?sum%10:sum;
            cur.next = new ListNode(sum);
            cur = cur.next;

            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }


        }
        if(bar == 1) {
            if (l1==null&&l2==null){
                cur.next = new ListNode(bar);
            }
            else if (l1!=null){
                cur.next = new ListNode(bar+l1.val);
            }else if (l2!=null){
                cur.next = new ListNode(bar+l2.val);
            }
        }
        return pre.next;

    }




      public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
     }
}
