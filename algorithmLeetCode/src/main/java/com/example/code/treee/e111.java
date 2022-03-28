package com.example.code.treee;

public class e111 {

    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }

        return Math.min(dfs(root.left) + 1,dfs(root.right) + 1);
    }


    public int minDepth(TreeNode root) {
        return dfs(root);
    }
}
