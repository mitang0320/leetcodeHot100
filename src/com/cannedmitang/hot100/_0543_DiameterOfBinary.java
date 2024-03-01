package com.cannedmitang.hot100;

public class _0543_DiameterOfBinary {

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return process(root)[1];
    }

    private int[] process(TreeNode root) {
        if(root == null) {
            return null;
        }
        final int[] l = process(root.left);
        final int[] r = process(root.right);

        int h = 0;
        int d = 0;
        if (l != null) {
            h = l[0] + 1;
            d = l[0] + 1;
        }
        if (r != null) {
            h = Math.max(h, r[0] + 1);
            d = d + r[0] + 1;
        }
        if (l != null) {
            d = Math.max(d, l[1]);
        }
        if (r != null) {
            d = Math.max(d, r[1]);
        }
        return new int[]{h, d};

    }

}
