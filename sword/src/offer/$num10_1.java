package offer;

import java.util.HashMap;

public class num10 {

    public static void main(String[] args) {
        int fib = fib(2);
        System.out.println(fib);
    }

    public static int fib(int n) {

      int a = 0;
      int b = 1;
        for (int i = 0; i < n; i++) {
            int sum = (a+b)%  1000000007;
            a = b;
            b = sum;
        }
        return a;
    }


}
