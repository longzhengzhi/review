package greedy;

public class num1221 {

    public int balancedStringSplit(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        int res = 0;


        for (int i = 0; i < chars.length; i++) {
            if (chars[i]=='L'){
                count++;
            }else {
                count--;
            }
            if (count==0){
                res++;
            }
        }
        return res;


    }

}
