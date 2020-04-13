package longgg;

import java.util.Arrays;
import java.util.HashMap;

public class night {


    public static void main(String[] args) {
        int nums[] = {3,1,2,5,4};
        int len = 5;
        int target = 3;
        int[] tend = tend(nums, len, target);
        for (int i = 0; i < tend.length; i++) {
            System.out.println(tend[i]);

        }
    }

    public static int[]  tend(int[] nums,int len,int target){
        HashMap hashMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i],i+1);
        }
        Arrays.sort(nums);
        int ints[] = new int[target];

        int a = (int)hashMap.get(nums[--len]);
        int b = (int)hashMap.get(nums[--len]);
        int c = (int)hashMap.get(nums[--len]);


        for (int i = 0; i < ints.length; i++) {
            ints[i] = nums[--len];
        }
        return ints;
    }


}
