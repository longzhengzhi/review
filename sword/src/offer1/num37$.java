package offer1;

public class num37 {


    StringBuilder sb ;
    int i;

    public String serialize(TreeNode root) {
        if (root==null) return null;
        sb = new StringBuilder();
        serializeDFS(root);
        return sb.toString();
    }

    public void serializeDFS(TreeNode root){
        if (root==null) {
            sb.append('#');
            return;
        }
        else sb.append((char)( root.val+'0'));
        serializeDFS(root.left);
        serializeDFS(root.right);
    }

    public TreeNode deserialize(String data) {
        char[] chars = data.toCharArray();
        if (chars[i]=='#'){
            i++;
            return null;
        }
        TreeNode root = new TreeNode(chars[i++]-'0');
        root.left = deserialize(data);
        root.right = deserialize(data);
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
