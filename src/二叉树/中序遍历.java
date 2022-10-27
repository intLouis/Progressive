package 二叉树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 中序遍历 {
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
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur.left);
                cur = cur.left;
            } else {
                cur = stack.pop();
                res.add(cur.val);
                cur = cur.right;
            }
        }
    }

    void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        res.add(root.val);
        dfs(root.right);
    }

    /**
     * 统一的遍历方式
     *
     * @param root
     */
    void biaozhunBfs(TreeNode root) {
        if (root != null) stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode curr = stack.peek();
            if (curr != null) {
                stack.pop();//curr先出栈
                if (curr.right != null) stack.push(curr);//添加右节点

                stack.push(curr); //添加中间节点 但没处理
                stack.push(null);//标记中间节点访问但没处理

                if (curr.left != null) stack.push(curr.left);

            } else { //遇到空节点时，将下一个节点放进结果集
                stack.pop();//空节点弹出
                curr = stack.pop();
                res.add(curr.val);
            }
        }
    }
}
