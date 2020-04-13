package top100;

import java.util.HashMap;
import java.util.Stack;

public class num20 {
    public static void main(String[] args) {
        String s= "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        HashMap<Character, Character> hashMap = new HashMap();
        hashMap.put(')','(');
        hashMap.put(']','[');
        hashMap.put('}','{');
        char[] chars = s.toCharArray();


        if (chars.length%2!=0){
            System.out.println(chars.length);
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {

            if (hashMap.containsKey(chars[i])){
                char top = stack.empty()?'0':stack.pop();
                if (top!=hashMap.get(chars[i])){
                    return false;
                }
            }else {
                stack.push(chars[i]);
            }
        }

        return stack.isEmpty();
    }
}
