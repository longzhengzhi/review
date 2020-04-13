package top100;

public class num70 {

    public static void main(String[] args) {
        System.out.printf(""+ climbStairs4(46));
    }

    public static int climbStairs(int n) {
        if (n==1){
            return 1;
        }else if (n==2){
            return 2;
        }else {
            return climbStairs(n-2)+climbStairs(n-1);
        }

    }
    public static int climbStairs4(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }



}
