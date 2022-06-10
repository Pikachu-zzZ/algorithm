package com.example.code.treee;

public class e111 {

    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }

        if(root.left ==null && root.right ==null){
            return 1;
        }
        int leftDepth = Integer.MAX_VALUE;
        int rightDepth = Integer.MAX_VALUE;
        if(root.left!=null){
            leftDepth = dfs(root.left) + 1;
        }

        if(root.right!=null){
            rightDepth = dfs(root.right) +1;
        }

        return Math.min(leftDepth,rightDepth);
    }


    public int minDepth(TreeNode root) {
        return dfs(root);
    }
}
