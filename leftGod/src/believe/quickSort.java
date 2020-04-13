package believe;

import java.util.Arrays;

public class quickSort {


    public static void main(String[] args) {
        int []arr = new int[]{0,1,9,5,4,3,2,8,7,6};
         quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quick(int[] arr,int left,int right){
        int l = left;
        int r = right;
        int mid = (l+r)/2;
        while (l<r){
            while (arr[l]<arr[mid]){
                l+=1;
            }
            while (arr[r]>arr[mid]){
                r-=1;
            }

            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            if (l>=r){
                break;
            }


            if (arr[l] == arr[mid]){
                r--;
            }
            if (arr[r] == arr[mid]){
                l++;
            }

        }
        if (l==r){
            l += 1;
            r -= 1;
        }

        if (l<right) {
            quick(arr,l,right );
        }
        if (left<r){
            quick(arr,left,r);
        }
    }

}
