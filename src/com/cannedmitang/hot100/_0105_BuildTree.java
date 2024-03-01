package com.cannedmitang.hot100;

import java.util.Arrays;

public class _0105_BuildTree {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if ( preorder == null || preorder.length == 0) {
            return null;
        }
        if (preorder.length == 1) {
            return new TreeNode(preorder[0]);
        }
        int root = preorder[0];
        final int rootOf = indexOf(inorder, root);
        final int[] preorderLeft = Arrays.copyOfRange(preorder, 1, rootOf + 1);
        final int[] inorderLeft = Arrays.copyOfRange(inorder, 0, rootOf);
        TreeNode left = buildTree(preorderLeft, inorderLeft);
        final int[] preorderRight = Arrays.copyOfRange(preorder, rootOf+1, preorder.length);
        final int[] inorderRight = Arrays.copyOfRange(inorder, rootOf + 1, inorder.length);
        final TreeNode right = buildTree(preorderRight, inorderRight);
        return new TreeNode( preorder[0], left, right);
    }

    public int indexOf(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
