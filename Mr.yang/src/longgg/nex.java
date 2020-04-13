package longgg;

import java.util.Scanner;

public class nex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int a = scanner.nextInt();
       Object ob[] = new Object[a+1];
        for (int i = 0; i < a+1; i+=2) {
            ob[i] = scanner.next();
            ob[i+1] = scanner.nextInt();
        }
        tesst(ob);
    }


    public static void tesst(Object object[]){

        for (int i = 0; i < object.length; i+=2) {
            int sum = 0;
            int res = 0;
            String a = (String)object[i];
            int b = (int)object[i+1];
            char[] chars = a.toCharArray();


            int ints[] = new int[a.length()];
            for (int j = 0; j < a.length(); j++) {
                ints[j] = (int)chars[i];
            }

            for (int j = 0; j < ints.length; j++) {
                sum += ints[j];
            }
            System.out.println(b);
            System.out.println(sum);
            if ((int)sum==b){
                res+=1;
            }
            System.out.println(res);
        }


    }

}
