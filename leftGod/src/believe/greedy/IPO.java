package believe.greedy;

import java.util.Comparator;
import java.util.PriorityQueue;

public class IPO {
    public static void main(String[] args) {
        IPO ipo = new IPO();
        int[]costs = new int[]{5,10,100};
        int[]profits = new int[]{7,8,60};
        int maximizedCapital = ipo.findMaximizedCapital(costs, profits, 3, 20);
        System.out.println(maximizedCapital);
    }

    public class project{
        int cost;
        int profit;
        public project(int cost, int profit) {
            this.cost = cost;
            this.profit = profit;
        }
    }
    //小根堆，最小花费排前面
    public class MinCostHeap implements Comparator<project>{

        @Override
        public int compare(project o1, project o2) {
            return o1.cost-o2.cost;
        }
    }
    public class MaxCostHeap implements Comparator<project>{

        @Override
        public int compare(project o1, project o2) {
            return o2.profit-o1.profit;
        }
    }


    public int findMaximizedCapital(int costs[], int profits[], int k, int w) {
        PriorityQueue<project> min = new PriorityQueue<>(new MinCostHeap());
        PriorityQueue<project> max = new PriorityQueue<>(new MaxCostHeap());
        for (int i = 0; i < costs.length; i++) {
            min.add(new project(costs[i],profits[i]));
        }
        for (int i = 0; i < k; i++) {
            while (!min.isEmpty()&&min.peek().cost<w){
                max.add(min.poll());
            }
            if (max.isEmpty()){
                return w;
            }
            w += max.poll().profit;
        }
        return 0;
    }

}
