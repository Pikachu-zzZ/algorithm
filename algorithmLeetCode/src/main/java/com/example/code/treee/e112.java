package com.example.code.treee;

public class e112 {


    public boolean dfs(TreeNode root, int targetSum){
        if(root == null ){
            return false;
        }

        if(root.left == null && root.right ==null){
            return root.val == targetSum;
        }

        boolean dfsLeft = dfs(root.left, targetSum - root.val);
        boolean dfsRight = dfs(root.right, targetSum - root.val);


        return dfsLeft || dfsRight;

    }


    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root,targetSum);
    }
}
