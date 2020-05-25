package greedy;

import java.util.HashMap;

public class num392 {


    public boolean isSubsequence(String s, String t) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < t.length(); i++) {
            hashMap.put(t.charAt(i),i);
        }

        int preIndex = -1;

        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))==false){
                return false;
            }else {
                if ((int)hashMap.get(s.charAt(i))<preIndex){
                    return false;
                }else {
                    preIndex = (int)hashMap.get(s.charAt(i));
                }
            }
        }
        return true;

    }
}
