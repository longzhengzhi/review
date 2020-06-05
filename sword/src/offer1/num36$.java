package offer1;

public class num36 {

    Node pre ;
    Node head ;

    public Node treeToDoublyList(Node root) {
        if (root==null) return null;
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    private void dfs(Node root) {
        if (root==null) return;
        if (head==null) head = root;

    }

    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

}
