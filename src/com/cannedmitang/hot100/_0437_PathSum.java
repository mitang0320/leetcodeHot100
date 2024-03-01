package com.cannedmitang.hot100;

public class _0437_PathSum {

    public int pathSum(TreeNode root, long targetSum) {
        if (root ==null) {
            return 0;
        }
        int res = process(root, targetSum);
        res += pathSum (root.left, targetSum);
        res += pathSum (root.right, targetSum);
        return res;
    }

    public int process(TreeNode root, long targetSum) {
        if (root == null) {
            return 0;
        }
        int res = 0;
        if (root.val == targetSum) {
            res++;
        }
        res += process(root.left, targetSum - root.val);
        res += process(root.right, targetSum - root.val);
        return res;
    }

}
