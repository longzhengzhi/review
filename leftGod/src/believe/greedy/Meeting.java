package believe.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Meeting {
    public class Project {
        int start;
        int end;
    }
    //一些项目要占用一个会议室宣讲，会议室不能同时容纳两个项目的宣讲。 给你每一个项目开始的时间和结束的时间(给你一个数组，里面 是一个个具体的项目)，你来安排宣讲的日程，要求会议室进行 的宣讲的场次最多。返回这个最多的宣讲场次。
    //
    //贪心策略：
    //
    //        1、开始时间最早的项目先安排。反例：开始时间最早，但持续时间占了一整天，其他项目无法安排。
    //
    //        2、持续时间最短的项目先安排。反例：这样安排会导致结束时间在此期间和开始时间在此期间的所有项目不能安排。
    //
    //        3、最优策略：最先结束的项目先安排。
    public class MostEarlyEndComparator implements Comparator<Project>{
        @Override
        public int compare(Project o1, Project o2) {
            return o1.end-o2.end;
        }
    }

    public int solution(Project projects[],int currentTime) {
        int res = 0;
        Arrays.sort(projects,new MostEarlyEndComparator());
        for (int i = 0; i < projects.length; i++) {
            if (projects[i].start>=currentTime){
                res += 1;
            }
            currentTime = projects[i].end;
        }
        return res;
    }
}
