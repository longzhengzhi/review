package offer1;

public class num28  {

    public boolean isSymmetric(TreeNode root) {
        if (root==null) return true;
        return recur(root.left,root.right);
    }

    private boolean recur(TreeNode root1,TreeNode root2){
        if (root1==null && root2==null) return true;
        if (root1==null || root2==null) return false;
        return root1.val==root2.val && recur(root1.left, root2.right) && recur(root1.right, root2.left);

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
