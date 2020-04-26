package com.xll.print;


public class Print {

    public static void main(String[] args) throws InterruptedException {

    }

    public int rangeSumBST(TreeNode root, int L, int R) {

        int[] arr = {0};

        // 中序遍历这棵树



        return 0;
    }

    public void cal(TreeNode root, int L, int R, int[] arr) {
        if (root == null) return;

        if (root.left != null) {
            cal(root.left, L, R, arr);
        }


    }

    public void p(TreeNode root) {
        if (root != null && root.left != null) {
            p(root.left);
        }
        System.out.println(root.val);
        if (root != null && root.right != null) {
            p(root.right);
        }
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

