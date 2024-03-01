package com.cannedmitang.hot100;


public class _0230_KthSmallestElementInABst {

    class NodeRes {
        public boolean found;
        public int sumCount;

        public int target;
    }

    public int kthSmallest(TreeNode root, int k) {
        return process(root, k).target;
    }

    private NodeRes process(TreeNode root, int k) {
        int sumCount = 1;
        if (root.left != null) {
            final NodeRes left = process(root.left, k);
            if (left.found) {
                return left;
            }
            sumCount += left.sumCount;
        }
        if (sumCount == k) {
            final NodeRes nodeRes = new NodeRes();
            nodeRes.found = true;
            nodeRes.target = root.val;
            return nodeRes;
        }
        if (root.right != null) {
            final NodeRes right = process(root.right, k - sumCount);
            if ( right.found) {
                return right;
            }
            sumCount += right.sumCount;
        }
        final NodeRes nodeRes = new NodeRes();
        nodeRes.found = false;
        nodeRes.sumCount = sumCount;
        return nodeRes;
    }

}
