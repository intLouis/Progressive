package 二叉树;

public class 二叉树最小深度_20220515 {
    public static class TreeNode {
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
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(6);
        TreeNode treeNode6 = new TreeNode(5);

        treeNode1.right = treeNode2;
        treeNode2.left = treeNode3;
        treeNode2.right = treeNode4;
        treeNode4.left = treeNode5;
        treeNode4.right = treeNode6;

        System.out.println(getDepth(treeNode1));

    }

   static   int getDepth(TreeNode root) {
        if (root == null) return 0;

        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);
        //以下两种情况都不算最低点
        //左孩子不为空，右孩子为空
        if (root.left != null && root.right == null) return 1 + leftDepth;
        //左孩子为空，右孩子不为空
        if (root.left == null && root.right != null) return 1 + rightDepth;

        return Math.min(leftDepth, rightDepth);

    }
}
