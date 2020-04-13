package believe;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class unionFindSet {

    private static Map<ListNode,ListNode> fatherMap;
    private static Map<ListNode,Integer> nodesNumMap;


    public unionFindSet(List<ListNode> nodes){
        fatherMap = new HashMap<>();
        nodesNumMap = new HashMap<>();
        for (ListNode node:nodes
             ) {
            fatherMap.put(node,node);
            nodesNumMap.put(node,1);
        }
    }


    public static void union(ListNode node1,ListNode node2){
        ListNode head1 = getHead(node1);
        ListNode head2 = getHead(node2);
        if (head1!=head2){
            int size1 = nodesNumMap.get(head1);
            int size2 = nodesNumMap.get(head2);
            if (size1<=size2){
                fatherMap.put(head1,head2);
                nodesNumMap.put(head2,size1+size2);
            }else {
                fatherMap.put(head2,head1);
                nodesNumMap.put(head1,size1+size2);
            }
        }
    }


    public static boolean isSameSet(ListNode node1,ListNode node2){
        return getHead(node1)==getHead(node2);
    }

    public static ListNode getHead(ListNode node){
        //递归写法
        if (node==null){
            return null;
        }
        ListNode fater = fatherMap.get(node);
        while (fatherMap.get(node)!=fater){
            fater = getHead(fater);
        }
        fatherMap.put(node,fater);


        //写个非递归的
        //Stack<ListNode> stack = new Stack();
        //ListNode cur = node;
        //while (cur!=fater){
        //    stack.push(cur);
        //    cur = fater;
        //    fater = fatherMap.get(cur);
        //}
        //while (!stack.empty()){
        //    fatherMap.put(stack.pop(),fater);
        //}

        return fater;
    }


}
