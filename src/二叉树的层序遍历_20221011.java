import java.util.*;

public class 二叉树的层序遍历_20221011 {

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

    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);

        int size = list.size();
        while (!list.isEmpty()){
            List<Integer> item = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = list.pop();
                item.add(node.val);
                if (node.left != null) list.add(node.left);
                if (node.right != null) list.add(node.right);
            }
            res.add(item);
        }
        return res;
    }
}
