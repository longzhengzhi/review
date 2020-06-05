package offer1;

public class num39 {


    public int majorityElement(int[] nums) {
        int votes =0,x=0;
        for (int num: nums
             ) {
            if (votes==0) x = num;
            votes += num==x ?-1:1;
        }
    }

}
