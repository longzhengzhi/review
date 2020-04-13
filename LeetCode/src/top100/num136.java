package top100;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class num136 {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
    }

    public int singleNumber(int[] nums) {
        HashSet hashSet = new HashSet();

        for (int i = 0; i < nums.length; i++) {
            boolean add = hashSet.add(nums[i]);
            if (add==false){
                hashSet.remove(nums[i]);
            }
        }
        Iterator iterator = hashSet.iterator();
        return (int)iterator.next();
    }
    public int singleNumber1(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result = result^nums[i];
        }
        return result;
    }

}
