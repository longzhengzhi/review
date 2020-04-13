package believe;

import java.util.Iterator;
import java.util.PriorityQueue;

public class goldBars{

    public static void main(String[] args) {
        int arr[] = {10, 20, 30};
        System.out.println(lessMoney(arr));
    }


    public static int lessMoney(int arr[]){
        if (arr==null||arr.length==0){
            return 0;
        }
        PriorityQueue<Integer> minheap = new PriorityQueue();
        for (int i = 0; i < arr.length; i++) {
            minheap.add(arr[i]);
        }
        Iterator<Integer> iterator = minheap.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        int res = 0;
        int curCost = 0;
        while (minheap.size()>1){
            curCost = minheap.poll() + minheap.poll();
            res += curCost;
            minheap.add(curCost);
        }
        return res;

    }
}
