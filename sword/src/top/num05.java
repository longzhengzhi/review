package top;

public class num05 {
    public String replaceSpace(String s) {

        char[] chars = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (' '==chars[i]){
                builder.append("%20");
            }else {
                builder.append(chars[i]);
            }
        }
        return builder.toString();
    }
}
