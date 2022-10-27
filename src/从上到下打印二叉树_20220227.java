import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 从上到下打印二叉树_20220227 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public 从上到下打印二叉树_20220227() {
    }

    public int[] levelOrder(TreeNode root) {
        if(root == null) return new int[0];
        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode> treeNodes = new LinkedList<TreeNode>() {{ add(root); }};

        while (!treeNodes.isEmpty()) {
            TreeNode node = treeNodes.poll();
            res.add(node.val);
            if (node.left != null) {
                treeNodes.add(node.left);
            }
            if (node.right != null) {
                treeNodes.add(node.right);
            }
        }

        int[] ints = new int[res.size()];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = res.get(i);
        }

        return ints;

    }
}
