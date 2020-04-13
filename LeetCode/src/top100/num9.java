package top100;

import java.util.concurrent.Callable;

public class num9 {


    public static void main(String[] args) {
        System.out.println(""+isPalindrome(11));

    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int help = 1;
        int tmp = x;
        while (tmp >= 10) {
            help *= 10;
            tmp /= 10;
        }
        while (x != 0) {
            if (x % 10 != x / help) {
                return false;
            }
            //掐头去尾的数
            x = x % help / 10;
            //因为掐头去尾所以/100
            help /= 100;
        }
        return true;


    }




}


class A implements Callable{

    @Override
    public Object call() throws Exception {
        return null;
    }
}
