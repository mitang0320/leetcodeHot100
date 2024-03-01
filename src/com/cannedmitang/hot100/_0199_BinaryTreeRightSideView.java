package com.cannedmitang.hot100;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class _0199_BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        final LinkedList<TreeNode> deque = new LinkedList<>();
        TreeNode nextLast = root;
        TreeNode currLast = root;
        deque.addLast(root);
        while (!deque.isEmpty()) {
            final TreeNode node = deque.pollFirst();
            if (node.left != null) {
                deque.addLast(node.left);
                nextLast = node.left;
            }
            if (node.right != null) {
                deque.addLast(node.right);
                nextLast = node.right;
            }
            if (node == currLast) {
                res.add(node.val);
                currLast = nextLast;
            }
        }
        return res;
    }

}
