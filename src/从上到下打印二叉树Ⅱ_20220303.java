import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 从上到下打印二叉树Ⅱ_20220303 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();
        if (root != null) queue.add(root);

        TreeNode cur = root;
        while (cur != null) {
            List<Integer> curLevel = new ArrayList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.peek();
                curLevel.add(node.val);

                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
            }
        }
        return res;
    }
}
