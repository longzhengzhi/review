package offer1;

import java.util.LinkedList;

public class num9 {

    class CQueue {
        LinkedList<Integer> m ;
        LinkedList<Integer> n ;
        public CQueue() {
            m = new LinkedList<>();
            n = new LinkedList<>();
        }

        public void appendTail(int value) {
            m.addLast(value);
        }

        public int deleteHead() {
            if (!n.isEmpty()) return n.pollLast();
            if (m.isEmpty()) return -1;
            while (!m.isEmpty()) {
                n.addLast(m.pollLast());
            }
            return n.pollLast();
        }
    }

}
