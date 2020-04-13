package top100;

public class num35 {


    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<=target){
                if (nums[i]==target){
                    return i;
                }
                if (i==nums.length-1){
                    return nums.length;
                }
            }else {
                return i;
            }
        }
        return 0;

    }
}
