package believe;

import java.util.Arrays;
import java.util.HashMap;

public class copyList {

    public static void main(String[] args) {
        Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.rand = head.next.next;
        head.next.rand = head.next.next.next;
        Node copy = copy1(head);

        System.out.println("*****************");
        while (copy!=null){
            System.out.println(copy);
            copy = copy.next;
        }
    }


    public static Node copy(Node node){
        if (node==null){
            return null;
        }
        HashMap<Node,Node> map = new HashMap();


        //深度复制
        Node cur = node;
        while (cur!=null){
            map.put(cur,new Node(cur.val));
            cur = cur.next;
        }
        cur = node;
        while (cur!=null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).rand = map.get(cur.rand);
            cur = cur.next;
        }

        return map.get(node);
    }

    public static Node copy1(Node node){
        if (node==null){
            return null;
        }
        Node cur = node;
        //copy every node and append
        while (cur!=null){
            Node copy= new Node(cur.val);
            copy.next = cur.next;
            cur.next = copy;
            cur = cur.next.next;
        }
        cur = node;

        //set the rand pointer of every copy node
        while (cur!=null){
            if (cur.rand!=null) {
                cur.next.rand = cur.rand.next;
            }
            cur = cur.next.next;
        }
        cur = node;
        //split
        Node copyHead = null;
        Node copyTail = null;
        Node next = null;
        while (cur!=null){
            next = cur.next;
            if (copyHead==null){
                copyHead = next;
                copyTail = next;
            }else {
                copyTail.next = next;
                copyTail = next;
            }

            cur = cur.next.next;
        }
        return copyHead;

    }

}
class Node {
    int val;
    Node next;
    Node(int x) {
        val = x;
    }
    Node rand;

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", next=" + next +
                ", rand=" + rand +
                '}';
    }
}
