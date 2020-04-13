package top;

import java.util.HashSet;
import java.util.Set;

public class num03 {

    public int findRepeatNumber(int[] nums) {
        Set set = new HashSet();
        for (int i = 0; i < nums.length; i++) {

            boolean add = set.add(nums[i]);
            if (add==false){
                return nums[i];
            }
        }
        return Integer.MAX_VALUE;
    }

}
