package 二叉树;

import java.util.ArrayList;
import java.util.List;

public class 二叉树的所有路径_20220518 {

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


    List<Integer> path = new ArrayList<>();
    List<String> res = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root);
        return res;
    }

    void dfs(TreeNode root) {
        if (root != null) path.add(root.val);

        if (root.left == null && root.right == null) {
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < path.size(); i++) {
                s.append(path.get(i)).append("->");
            }
            res.add(s.substring(0, s.length() - 2));
        }
        if (root.left != null) {
            dfs(root.left);
            path.remove(path.size() - 1);
        }
        if (root.right != null) {
            dfs(root.right);
            path.remove(path.size() - 1);
        }

    }
}
