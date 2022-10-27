package 二叉树;

public class 路径总和_20220522 {
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
        TreeNode treeNode1 = new TreeNode(5);
        TreeNode treeNode2 = new TreeNode(4);
        TreeNode treeNode3 = new TreeNode(8);
        TreeNode treeNode4 = new TreeNode(11);
        TreeNode treeNode5 = new TreeNode(13);
        TreeNode treeNode6 = new TreeNode(4);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(2);
        TreeNode treeNode9 = new TreeNode(1);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode4.left = treeNode7;
        treeNode4.right = treeNode8;
        treeNode3.left = treeNode5;
        treeNode3.right = treeNode6;
        treeNode6.right = treeNode9;
        路径总和_20220522 路径总和_20220522 = new 路径总和_20220522();
        路径总和_20220522.hasPathSum(treeNode1,22);
    }


    boolean res = false;
    int sum = 0;

    boolean hasPathSum(TreeNode root, int targetSum) {
        sum += root.val;
        return res;
    }

    void getTargetSum(TreeNode root, int targetSum) {
        if (sum > targetSum) {
            return;
        }
        if (root.left == null && root.right == null && sum == targetSum) {
            res = true;
            return;
        }
        if (root.left != null) {
            sum += root.left.val;
            getTargetSum(root.left, targetSum);
            sum -= root.left.val;
        }
        System.out.println(sum);
        if (root.right != null) {
            sum += root.right.val;
            getTargetSum(root.right, targetSum);
            sum -= root.right.val;
        }
        System.out.println(sum);

    }
}
