package com.cannedmitang.hot100;

/**
 * @author : loso
 * @version :
 * @date : Created in 2021/11/12 2:45 下午
 * @description :
 * @modified By : loso
 */
public class TreeNode {

     public int val;
     public TreeNode left;
     public TreeNode right;
    public TreeNode() {}
     public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }

}
