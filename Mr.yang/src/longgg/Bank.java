package longgg;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;
import java.util.Scanner;

public class Bank {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tar = scanner.nextInt();
        String ca[] = new String[tar];
        for (int i = 0; i < tar; i++) {
            ca[i] = scanner.next();
        }
        makedo(tar,ca);
    }


    public static void makedo(int tar,String x[]) {
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put('1', '1');
        hashMap.put('2', '5');
        hashMap.put('3', '8');
        hashMap.put('4', '7');
        hashMap.put('6', '9');
        hashMap.put('5', '2');
        hashMap.put('8', '3');
        hashMap.put('7', '4');
        hashMap.put('9', '6');



        for (int i = 0; i < x.length; i++) {


            char[] chars = x[i].toCharArray();

            if (x[i].length()%2!=0){
                System.out.println("NO");
                continue;
            }

            int j = x[i].length() - 1;
            int k = 0;
            for (int p = 0; p < chars.length/2; p++,j--) {

                if (chars[j] == hashMap.get(chars[p])  ) {
                    k++;
                }
            }
            if (k == x[i].length() / 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
