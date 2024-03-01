package com.cannedmitang.hot100;

public class _0236_LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return process(root, p, q).target;
    }

    class Info {
        public boolean foundQ;
        public boolean foundP;

        TreeNode target;

        Info(){
            foundP = false;
            foundQ = false;
            target = null;
        }
    }

    public Info process( TreeNode root, TreeNode p , TreeNode q) {
        if (root == null) {
            return new Info();
        }
        final Info left = process(root.left, p, q);
        final Info right = process(root.right, p, q);
        if (left.target != null) {
            return left;
        }
        if (right.target != null) {
            return right;
        }
        boolean foundP = root == p || left.foundP || right.foundP;
        boolean foundQ = root == q || left.foundQ || right.foundQ;
        Info info = new Info();
        info.foundP = foundP;
        info.foundQ = foundQ;
        if (foundP && foundQ) {
            info.target = root;
        }
        return info;
    }

}
