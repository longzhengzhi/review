package believe;

import java.util.Arrays;

public class heapSort {


    public static void main(String[] args) {
        int []arr = new int[]{0,1,9,5,4,3,2,8,7,6,1,1,1,1,1};
        for (int i = arr.length/2-1; i >=0 ; i--) {
            adjustHeap(arr,i,arr.length);
        }

        for (int i = arr.length-1; i >=0 ; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            adjustHeap(arr,0,i);
        }

        System.out.println(Arrays.toString(arr));

    }



    public  static void adjustHeap(int arr[], int i, int lenght) {

        int temp = arr[i];

        for (int j = 2*i+1; j < lenght; j = j*2+1) {
            if (j+1<lenght&&arr[j]<arr[j+1]){
                j = j+1;
            }
            if (arr[j]>temp){
                arr[i] = arr[j];
                i = j;
            }else {
                break;
            }
        }
        arr[i] = temp;
    }

}
