package believe;


import java.util.Stack;

public class palindromeList {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);
        //ListNode node5 = new ListNode(6);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        System.out.println(isPalindromeList(node));
    }


    public static boolean isPalindromeList(ListNode node){
        if (node.next==null||node.next.next==null){
            return true;
        }
        ListNode fast = node;
        ListNode slow = node;

        Stack stack = new Stack();

        while (fast.next!=null&&fast.next.next!=null){
            stack.push(slow.val);
            //System.out.println(stack.peek());
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = slow.next;
        if (stack.size()%2!=0){
           int a =  (int)stack.pop();

        }


        while (!stack.empty()&&slow!=null){
            if ((int)stack.pop()!=slow.val){
                return false;
            }
            slow = slow.next;
        }
        return true;


    }



}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}