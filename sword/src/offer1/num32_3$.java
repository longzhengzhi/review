package offer1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class num32_3 {


    public List<List<Integer>> levelOrder(TreeNode root) {
        boolean flag = true;
        if (root==null) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<TreeNode> que = new LinkedList<>();
        que.addLast(root);
        while (!que.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            //用 i++ 的话，每轮都要获取 queue.size() 的值，而队列的长度是在变化的。
            for (int i = que.size(); i > 0 ; i--) {
                TreeNode node = que.pollFirst();
                temp.add(node.val);
                if (node.left!=null) que.addLast(node.left);
                if (node.right!=null) que.addLast(node.right);
            }
            if (!flag)  temp = reverse(temp);
            res.add(temp);
        }
        return res;

    }

    private List<Integer> reverse(List<Integer> temp) {
        
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
