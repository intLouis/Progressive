//public class 树的子结构_20220205 {
//    public class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//
//        TreeNode(int x) {
//            val = x;
//        }
//    }
//
//    public boolean isSubStructure(TreeNode A, TreeNode B) {
//        boolean recur = recur(A, B);
//        boolean subStructure = isSubStructure(A.left, B);
//        boolean subStructure1 = isSubStructure(A.right, B);
//        return recur || subStructure || subStructure1
//    }
//
//    public boolean recur(TreeNode A, TreeNode B) {
//        if (B == null) return true;
//        if (A == null) return false;
//        if (A.val == B.val) {
//            return true;
//        }
//        return recur(A.left,B.left) && recur()
//    }
//}
