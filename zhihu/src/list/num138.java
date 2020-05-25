public class num138 {

    public Node copyRandomList(Node head) {
        if (head==null){
            return null;
        }
        Node cur = head;
        while (cur!=null){
           Node copy = new Node(cur.val);
           copy.next = cur.next;
           cur.next = copy;
           cur = cur.next.next;
        }

        //set the rand pointer of every copy node
       cur = head;
        while (cur!=null){
            if (cur.random!=null){
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }

        //split

        Node curHead = head.next;
        cur = head;
        Node curH = head.next;
        while (curHead.next!=null){
            //原
            cur.next = cur.next.next;
            cur = cur.next;

            //copy
            curHead.next = curHead.next.next;
            curHead = curHead.next;

        }

        cur.next = null;

        return curH;
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
