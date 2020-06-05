package offer1;

public class num35 {


    public Node copyRandomList(Node head) {
        if (head==null) return null;
        Node cur = head;
        while (cur!=null){
            Node copy = new Node(cur.val);
            copy.next = cur.next;
            cur.next = copy;
            cur = copy.next;
        }

        //randow
        cur = head;
        while (cur!=null){
            if (cur.random!=null){
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }


        //recover
        Node curHead = head.next;
        Node copyHead = head.next;
        cur = head;
        while (curHead.next!=null){
            cur.next = cur.next.next;
            curHead.next = curHead.next.next;

            cur = cur.next;
            curHead = curHead.next;
        }
        //别忘了最后一步
        cur.next = null;
        return copyHead;
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

}
