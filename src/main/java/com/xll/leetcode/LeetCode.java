package com.xll.leetcode;


public class LeetCode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);
        root.left.right.left = new TreeNode(9);

        int e = e(root);
        System.out.println(e);
    }

    /**
     *  计算二叉树的 左 叶子之和
     *    中序遍历
     */
    public static int e(TreeNode node) {
        if (node.left == null) {
            System.out.println(node.val);
        } else {
            e(node.left);
        }



        return 0;
    }

}















/**
 *  树 节点
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
