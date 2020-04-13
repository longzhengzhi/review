package believe;

public class z {

    public static void main(String[] args) {
        int arr[][] = {
                {1,  2,  3,  4,  5,  6},
                {7,  8,  9,  10, 11, 12},
                {13, 14, 15, 16, 17, 18}
        };
        zigZagPrintMatrix(arr);

    }

//1 2 7 13 8 3 4 9 14 15 10 5 6 11 16 17 12 18
   public static void zigZagPrintMatrix(int arr[][]){
        int aR = 0;
        int aC = 0;
        int bR = 0;
        int bC = 0;
        int endR = arr.length-1;
        int endC = arr[0].length-1;
        boolean flag = false;
        while (aR!=endR+1){
            printValue(arr,aR,aC,bR,bC,flag);
            aR = aC==endC?aR+1:aR;
            aC = aR==0?aC+1:aC;
            bC = bR==endR?bC+1:bC;
            bR = bC==0?bR+1:bR;
            flag = !flag;
        }
       System.out.println();
   }

   public static void printValue(int arr[][],int aR,int aC,int bR,int bC,boolean flag){
        if (flag){
            while (aR!=bR+1){
                System.out.print(arr[aR++][aC--]+" ");
            }
        }else {
            while (bR!=aR-1){
                System.out.print(arr[bR--][bC++]+" ");

            }
        }

   }



}
