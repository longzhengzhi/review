package believe;

public class printCircle {

    public static void main(String[] args) {
        int [][]arr = new int[][]
        {
            {1,2,3,4},
            {12,13,14,5},
            {11,16 ,15,6},
            {10,9,8,7},
                        };

        reuse(arr);
    }


    public static void reuse(int[][]arr){
        int fl = 0;
        int fr = 0;
        int ll = arr.length-1;
        int lr = arr[0].length-1;
       while (fl<=ll&&fr<=lr){
           printEdge(arr,fl++,fr++,ll--,lr--);
       }
    }

    public static void printEdge(int [][]arr,int fl,int fr,int ll,int lr){
        if (fl==ll){
            for (int i = fr; i <=lr ; i++) {
                System.out.print(arr[fl][i]+" ");
            }
        }else if (fr==lr){
            for (int i = fl; i <=ll ; i++) {
                System.out.print(arr[fr][i]+" ");
            }
        }else {
            int curC = fr;
            int curR = fl;
            while (curC!=lr){
                System.out.print(arr[fl][curC]+" ");
                curC++;
            }
            while (curR!=ll){
                System.out.print(arr[curR][lr]+" ");
                curR++;
            }
            while (curC!=fr){
                System.out.print(arr[ll][curC]+" ");
                curC--;
            }
            while (curR!=fl){
                System.out.print(arr[curR][fr]+" ");
                curR--;
            }


        }


    }


}
