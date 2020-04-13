package longgg;

public class migong {


    public static void main(String[] args) {

        int [][]num = new int[][]{
                {0,1,0,0,0,0},
                {0,0,0,1,0,0},
                {0,0,1,0,0,1},
                {1,1,0,0,0,0}
        };
        int size = num.length * num[0].length;
        StringBuilder builder = new StringBuilder();
        String run = run(num, 0, 0, 24,builder);


    }

    public static String run(int[][]num,int m,int n,int size,StringBuilder builder){



        if (num[3][5] == 2){
            return builder.toString();
        }



        if (m<num.length-1&&num[m+1][n]==0){
            builder.append("D");
            num[m+1][n]=2;
            run(num,m+1,n, size,builder);
        }
       else if (n<num[0].length-1&&num[m][n+1]==0){
            builder.append("R");
            num[m][n+1]=2;
            run(num,m,n+1, size,builder);
        }
      else   if (num[m-1][n]==0){
            builder.append("U");
            num[m-1][n]=2;
            run(num,m-1,n,size,builder);
        }
       else if (num[m][n-1]==0){
            builder.append("L");
            num[m][n-1]=2;
            run(num,m,n-1,size,builder);
        }
       else {
           num[m][n] = 3;
        }



        return builder.toString();

}

}
