package top100;

public class num27 {
    public static void main(String[] args) {
        int[] nums = {3,2};
        int val = 3;
        System.out.println(removeElement(nums, val));
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!=val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;

    }
}
