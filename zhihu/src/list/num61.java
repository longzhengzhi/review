import java.util.HashMap;

public class num61 {

    public static void main(String[] args) {

    }


    public ListNode k(ListNode head, int k){
        ListNode p = head;
        for(int i=0;i<k;i++){
            p = p.next;
        }

        while(p != null){
            p = p.next;
            head = head.next;
        }

        return head;

    }


    public ListNode rotateRight(ListNode head, int k) {
        int len = 0;
        ListNode b = head;
        while (len<k&&head!=null){
            len++;
            b = b.next;
        }
        //k=0次，head为空
        if (len==0){
            return head;
        }
        // 如果b为 null，那么k大于节点长度，重新计算。
        if (b==null){
            k %= len ;
            if(k == 0) return head;
            for(b = head,len = 0;len < k;len++){
                b = b.next ;
            }
        }
        ListNode slow = head;
        while (b.next!=null){
            slow = slow.next;
            b = b.next;
        }

        ListNode curHead = slow.next;
        slow.next = null;
        b.next = head;
        return curHead;


    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}
