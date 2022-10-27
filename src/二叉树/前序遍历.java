package 二叉树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 前序遍历 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    Stack<TreeNode> stack = new Stack<>();
    List<Integer> res = new ArrayList<>();

    void bfs(TreeNode root) {
        if (root == null) return;
        stack.push(root);
        if (!stack.isEmpty()) {
            TreeNode pop = stack.pop();
            //中间节点出栈
            res.add(pop.val);
            //右节点入栈
            if (root.right != null) stack.push(root.right);
            //左节点入栈
            if (root.left != null) stack.push(root.left);
        }
    }

    void dfs(TreeNode root) {
        if (root == null) return;
        res.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
}
