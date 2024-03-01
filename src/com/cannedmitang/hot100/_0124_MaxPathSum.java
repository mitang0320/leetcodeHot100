package com.cannedmitang.hot100;

public class _0124_MaxPathSum {

    public int maxPathSum(TreeNode root) {
        return process(root).maxSum;
    }

    class Info {
        int maxEdge;
        int maxSum;
    }

    private Info process(TreeNode root) {
        if (root == null) {
            return null;
        }
        Info left = process(root.left);
        Info right = process(root.right);

        int maxEdge = root.val;
        int sum = root.val;
        int maxSum = root.val;
        if (left != null) {
            maxEdge = Math.max(maxEdge, root.val + left.maxEdge);
            maxSum = left.maxSum;
            sum = Math.max(sum, sum + left.maxEdge);
        }
        if (right != null) {
            maxEdge = Math.max(maxEdge, root.val + right.maxEdge);
            maxSum = Math.max(maxSum, right.maxSum);
            sum = Math.max(sum, sum + right.maxEdge);
        }
        maxSum = Math.max(maxSum, sum);
        Info res = new Info();
        res.maxEdge = maxEdge;
        res.maxSum = maxSum;
        return res;
    }

}
