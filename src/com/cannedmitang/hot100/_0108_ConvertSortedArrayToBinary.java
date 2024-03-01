package com.cannedmitang.hot100;

public class _0108_ConvertSortedArrayToBinary {

    public TreeNode sortedArrayToBST(int[] nums) {
        return process(nums,0, nums.length - 1);
    }

    private TreeNode process(int[] nums, int l , int r) {
        if (l > r ) {
            return null;
        }
        int mid = ((r + l)>> 1);
        final TreeNode treeNode = new TreeNode(nums[mid]);
        final TreeNode left = process(nums, l , mid -1);
        final TreeNode right = process(nums, mid+1,r);
        treeNode.left = left;
        treeNode.right = right;
        return treeNode;

    }

}
