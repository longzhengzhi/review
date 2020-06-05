package offer1;

public class num26 {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A!=null && B!=null) && recur(A, B) || isSubStructure(A.left,B) || isSubStructure(A.right,B);
    }

    public boolean recur(TreeNode A, TreeNode B){
        if (B==null) return true;
        if (A==null||A.val!=B.val) return false;
        recur(A.right, B.right);
        recur(A.left, B.left);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
