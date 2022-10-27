package 二叉树;

import java.util.LinkedList;
import java.util.Queue;

public class 找树左下角的值_20220521 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int maxDepth = 0;
    int maxLeftVal;

    void traversal(TreeNode root, int leftDepth) {
        if (root.left == null && root.right == null) {
            if (leftDepth > maxDepth) {
                maxDepth = leftDepth;
                maxLeftVal = root.val;
            }
            return;
        }
        if (root.left != null) {
            leftDepth++;
            traversal(root.left, leftDepth);
            leftDepth--;
        }

        if (root.right != null) {
            leftDepth++;
            traversal(root.right, leftDepth);
            leftDepth--;
        }
        return;

    }

    int traversal2(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.add(root);
        int result = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (i == 0) result = poll.val;

                if (poll.left != null) queue.add(poll.left);

                if (poll.right != null) queue.add(poll.right);

            }
        }
        return result;
    }
}
