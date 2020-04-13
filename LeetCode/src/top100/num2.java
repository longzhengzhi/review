package top100;

import java.util.ArrayList;

public class num2 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l11 = new ListNode(4);
        ListNode l12 = new ListNode(3);
        l1.next = l11;
        l11.next = l12;
        ListNode l2 = new ListNode(5);
        ListNode l21 = new ListNode(6);
        ListNode l22 = new ListNode(4);
        l2.next = l21;
        l21.next = l22;


        ListNode listNode = addTwoNumbers(l1, l2);
        while (listNode!=null){
            System.out.print(listNode.val);
            listNode = listNode.next;
        }

    }


    public  static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();


        if (l1.val==0&&l2.val==0){
            return new ListNode(0);
        }


        do {
            s1.append(l1.val);
            l1 = l1.next;
        }while (l1!=null);


        do{
            s2.append(l2.val);
            l2 = l2.next;
        }while (l2!=null);



        s1.reverse();
        s2.reverse();
        String str1 = ""+s1;
        String str2 = ""+s2;

        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);


        int c = a+b;



        int d1 = c/100;
        int d2 = c/10%10;
        int d3 = c%100;

        ListNode listNode = new ListNode(d3);
        listNode.next = new ListNode(d2);
        listNode.next.next = new ListNode(d1);
        return listNode;

    }
}
