package believe;

public class trieTree {


    public static class TrieNode {
        public int across;
        public int end;
        public TrieNode[] nexts;

        public TrieNode() {
            super();
            across = 0;
            end = 0;
            nexts = new TrieNode[26];
        }
    }
    private TrieNode root;

    public trieTree() {
        super();
        root = new TrieNode();
    }
    
    public static void main(String[] args) {
        trieTree tree = new trieTree();
        tree.insert("abc");
        tree.insert("abde");
        tree.insert("bcd");
        System.out.println(tree.search("abc"));    //1
        System.out.println(tree.prefixNumber("ab"));    //2
    }
   




    //查询所有插入的字符串中，以prefix为前缀的有多少个
    //都差不多，就不写了
    public int prefixNumber(String prefix) {
        return 0;
    }


    //删除

    public void delete(String str){
        if (search(str)!=0){
            TrieNode cur = root;
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                int index = chars[i] - 'a';
                if (--cur.nexts[index].across==0){
                    cur.nexts[index] = null;
                    return;
                }else {
                    cur = cur.nexts[index];
                }
            }
            cur.end--;
        }
    }


    //查询这个字符串出现了几次
    public int search(String str){
        if (str==null){
            return 0;
        }
        char[] chars = str.toCharArray();
        TrieNode cur = root;
        for (int i = 0; i < chars.length; i++) {
            int index = chars[i] - 'a';
            if (cur.nexts[index]==null){
                return 0;
            }
            cur = cur.nexts[index];
        }
        return cur.end;
    }


    //向树中插入一个字符串
    public void insert(String str){
        char[] chars = str.toCharArray();
        TrieNode cur = root;
        for (int i = 0; i < chars.length; i++) {
            int index = chars[i] - 'a';
            if (cur.nexts[index]==null){
                cur.nexts[index] = new TrieNode();
            }
            cur = cur.nexts[index];
            cur.across++;
        }
        cur.end++;
    }


}

