package com.example.code.treee;

import java.util.ArrayList;
import java.util.List;

public class e94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        inorder(root, res);
        return res;
    }

    public void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }


    public TreeNode dfs(TreeNode root,int val){
        if(root == null){
            return null;
        }

        if(root.val == val){
            return root;
        }

        TreeNode l = dfs(root.left, val);
        TreeNode r = dfs(root.right, val);

        if(l != null){
            return l;
        }else if(r !=null){
            return r;
        }else {
            return null;
        }
    }

    // 删除二叉树节点，删除时需要和链表一样，将.left或者.right置为空，而不能直接将当前节点置为空。
    // 由于root节点没有父节点，因此，对root节点的操作就是将root置为空，且要单独判断才可以。
    public void delNode(TreeNode root,int val){
        if(root == null){
            return;
        }

        if(root.val == val){
            root = null;
        }else {
            delNode(root.left,val);
            delNode(root.right,val);
        }

    }



    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        TreeNode right1 = new TreeNode(3);
        root.left = left;
        root.right = right;
        left.right = right1;
        List<Integer> list = new e94().inorderTraversal(root);
        System.out.println(list);

        TreeNode res = new e94().dfs(root, 2);
        System.out.println(res.val);
        new e94().delNode(root,2);
        List<Integer> list1 = new e94().inorderTraversal(root);
        System.out.println(list1);
    }


}
