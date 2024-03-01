package com.cannedmitang.hot100;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class _0102_LevelOrder {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        TreeNode nextLast = root;
        TreeNode currLast = root;
        deque.addLast(root);
        List<Integer> line = new ArrayList<>();
        while (!deque.isEmpty()) {
            final TreeNode curr = deque.pollFirst();
            line.add(curr.val);
            if (curr.left != null){
                deque.addLast(curr.left);
                nextLast = curr.left;
            }
            if (curr.right != null) {
                deque.addLast(curr.right);
                nextLast = curr.right;
            }
            if (curr == currLast) {
                res.add(line);
                line = new ArrayList<>();
                currLast = nextLast;
            }
        }
        return res;
    }

}
