package longgg.primary_3;

public class primary3_3 {

    public static void main(String[] args) {
        int [][]arr = new int[][]
                {
                        {1,2,3,4},
                        {12,13,14,5},
                        {11,16 ,15,6},
                        {10,9,8,7},
                };
        reuser(arr);
    }


    public static void reuser(int [][] arr){
        int fl =0;
        int fr =0;
        int ll =arr.length-1;
        int lr = arr.length-1;
        while (fl<=ll&&fr<=lr){
            printEdge(arr,fl++,fr++,ll--,lr--);
        }


    }


    public static void printEdge(int [][]arr,int fl,int fr,int ll,int lr){
        //假如是一条线呢
        if (fl==ll){
            for (int i = fr; i < lr; i++) {
                System.out.print(arr[fl][i]+" ");
            }
        }
        if (fr==lr){
            for (int i = fl; i < ll; i++) {
                System.out.print(arr[i][fr]+" ");
            }
        }else {
            int i = fl;
            int j = fr;
            while (j < lr) {
                System.out.print(arr[fl][j] + " ");
                j++;
            }

            while (i < ll) {
                System.out.print(arr[i][lr] + " ");
                i++;
            }

            while (j > fr){
                System.out.print(arr[ll][j] + " ");
                j--;
            }

            while (i > fl){
                System.out.print(arr[i][fr] + " ");
                i--;
            }
           

        }
    }



}
