package believe;

public class Permutations {
    /**
     * 打印字符串的所有子序列-递归方式
     * @param str    目标字符串
     * @param index    当前子过程来到了哪个字符的决策上（要还是不要）
     * @param res    上级扔给本级的子序列
     */
    public static void printAllSubSequences(char[] str,int index,String res) {
        if (index==str.length){
            System.out.println(res);
        }else {
            //加上自己
            printAllSubSequences(str,index+1,res+String.valueOf(str[index]));
            //不加自己，""空串
            printAllSubSequences(str,index+1,res);
        }

    }
}
