package believe;

import java.util.Arrays;

public class theDutchflag {

    public static void main(String[] args) {
        int arr[] = {1,2, 1, 5, 4, 7, 2, 3, 9,1};

        int[] partition = partition(arr, 0, 9, 1);

        System.out.println(Arrays.toString(partition));

    }


    //给定一个数组arr，和一个数num，请把小于num的数放在数组的左边，等于num的数放在数组的中间，大于num的数放在数组的右边。
    public static int[] partition(int[] arr, int L, int R, int num) {
        int less = L - 1;
        int more = R + 1;

        while (L < more) {
            if (arr[L]<num){
                swap(arr,++less,L++);
            }else if (arr[L]>num){
                swap(arr,--more,L);
            }else {
                L++;
            }
        }

        return new int[]{less+1,more-1};

    }


    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }







}
