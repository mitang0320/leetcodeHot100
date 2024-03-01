package com.cannedmitang.hot100;

public class _0098_IsValidBST {

    class NodeRes {
        public int min;
        public int max;
        public boolean valid;

        NodeRes (boolean v) {
            valid = v;
        }
    }

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        return process(root).valid;
    }

    private NodeRes process( TreeNode root) {
        if (root == null) {
            return null;
        }
        final NodeRes left = process(root.left);
        final NodeRes right = process(root.right);
        int min = root.val;
        int max = root.val;
        if (left != null) {
            if (!left.valid) {
                return left;
            }
            if (left.max >= root.val) {
                return new NodeRes(false);
            }
            min = Math.min(min, left.min);
        }
        if (right != null) {
            if (!right.valid) {
                return right;
            }
            if (right.min <= root.val) {
                return new NodeRes(false);
            }
            max = Math.max(max, right.max);
        }
        NodeRes res = new NodeRes(true);
        res.max = max;
        res.min = min;
        return res;
    }

}
