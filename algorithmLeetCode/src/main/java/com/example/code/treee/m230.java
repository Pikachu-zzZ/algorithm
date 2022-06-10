package com.example.code.treee;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class m230 {

    private ArrayList<Integer> res ;
    public int kthSmallest(TreeNode root, int k) {
        res = new ArrayList<>();
        inorder(root);
        return res.get(k-1);
    }

    public void inorder(TreeNode root){
        if(root == null){
            return;
        }

        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
    }



    public int kthSmallest1(TreeNode root, int k) {
        // 使用迭代方法中序遍历，这样可以在找到答案后停止，不需要遍历整棵树
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        while (root != null || !stack.isEmpty()) {
            ////遍历左节点
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            // 获取最后一个左节点
            root = stack.pop();
            --k;
            if (k == 0) {
                break;
            }
            // 访问右节点
            root = root.right;
        }
        return root.val;

    }
}
