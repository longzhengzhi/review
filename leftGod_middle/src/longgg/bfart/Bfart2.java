package longgg.manacher;

import java.util.Arrays;

public class Manacher3 {

    public static void main(String[] args) {
        int[] arr = {6, 9, 1, 3, 1, 2, 2, 5, 6, 1, 3, 5, 9, 7, 2, 5, 6, 1, 9};
        System.out.println(getMinKthNum(arr,13));
    }

    public static int getMinKthNum(int[] arr, int k) {
        if (arr==null||k>arr.length||arr.length<0){
            return Integer.MIN_VALUE;
        }
        int[] copyOf = Arrays.copyOf(arr, arr.length);
         return bfprt(copyOf,0,arr.length-1,k-1);
    }

    public static int bfprt(int[] arr, int begin, int end, int i) {
        if (begin==end){
            return arr[begin];
        }
        int pivot = medianOfMedians(arr, begin, end);
        int[] pivotRange = partition(arr, begin, end, pivot);
        if (i>=pivotRange[0]&&i<=pivotRange[1]){
            return arr[i];
        }else if (i<pivotRange[0]){
            return bfprt(arr, begin, pivotRange[0]-1, i);
        }else {
            return bfprt(arr, pivotRange[1]+1, end, i);
        }
    }


    public static int medianOfMedians(int[] arr, int begin, int end) {
        int num = end-begin+1;
        int offSet = (num%5)==0?0:1;
        int[] medians = new int[num/5+offSet];
        for (int i = 0; i < medians.length; i++) {
            int beginI = i*5+begin;
            int endI = beginI+4;
            medians[i] = getMedian(arr, beginI, Math.min(end,endI));
        }
        return bfprt(medians,0,medians.length-1,medians.length/2);
    }

    public static int getMedian(int[] arr, int begin, int end) {
        insertionSort(arr, begin, end);
        int sum = end-begin;
        int mid = sum/2+sum%2;
        return arr[mid];
    }

    public static void insertionSort(int[] arr, int begin, int end) {
        if (begin >= end) {
            return;
        }
        for (int i = begin + 1; i <= end; i++) {
            for (int j = i; j > begin; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    public static int[] partition(int[] arr, int begin, int end, int pivot) {
        int l = begin-1;
        int r = end+1;
        int i = begin;
        while (i<r){
            if (arr[i]<pivot){
                swap(arr,i++,++l);
            }else if (arr[i]>pivot){
                swap(arr,i,--r);
            }else {
                i++;
            }
        }
        return new int[]{l+1,r-1};
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


}
