package com.example.code.treee;

import org.junit.Test;

public class e101 {

    public boolean dfs(TreeNode p,TreeNode q){
        if (p == null && q == null) {
            return true;
        }
        else if (p == null || q == null) {
            return false;
        }else
            return p.val == q.val && dfs(p.left, q.right) && dfs(p.right, q.left);
    }

    public boolean isSymmetric(TreeNode root) {
        return dfs(root,root);
    }
}
