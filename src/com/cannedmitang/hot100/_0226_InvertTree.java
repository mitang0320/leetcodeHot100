package com.cannedmitang.hot100;

import java.util.Arrays;

public class _0226_InvertTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        final TreeNode r = invertTree(root.right);
        final TreeNode l = invertTree(root.left);
        root.right = l;
        root.left = r;
        Arrays.hashCode(new int[1]);
        return root;
    }

}
