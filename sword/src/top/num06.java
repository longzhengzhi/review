package top;

import java.util.Stack;

public class num06 {


    public static void main(String[] args){
        int x = 1;
        x = x / 0;
        System.out.println("x = "+x);
    }

    public int[] reversePrint0(ListNode head) {
        Stack<ListNode> stack = new Stack();
        ListNode cur = head;
        while (cur!=null){
            stack.push(cur);
            cur = cur.next;
        }

        int ints[] = new int[stack.size()];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = stack.pop().val;
        }
        return ints;
    }


    public int[] reversePrint(ListNode head) {
        int size =0;
        ListNode cur = head;
        while (cur!=null){
            size++;
            cur = cur.next;
        }

        int ints[] = new int[size];
        while (head!=null){
            ints[--size] = head.val;
            head = head.next;
        }
        return ints;
    }

    public ListNode reverse(ListNode head){
            ListNode resultList = new ListNode(-1);
            ListNode p = head;
            while (p!=null){
                ListNode temp = p.next;
                p.next  = resultList.next;
                resultList.next = p;
                p = temp;
            }
            return resultList.next;
    }
    public ListNode reverse0(ListNode head){
        ListNode resultList = new ListNode(-1);
        resultList.next = head;
        ListNode p = head;
        ListNode pNext = head.next;
        while (pNext!=null){
            p.next = pNext.next;
            pNext.next = resultList.next;
            resultList.next = pNext;
            pNext = p.next;
        }
        return resultList.next;
    }


}

class ListNode {
     int val;
      ListNode next;
     ListNode(int x) {
         val = x;
     }
      }
