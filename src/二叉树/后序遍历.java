package 二叉树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 后序遍历 {
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

    }

    void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        dfs(root.right);
        res.add(root.val);
    }
}
