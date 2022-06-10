package com.example.code.treee;

import java.util.ArrayList;

public class m173 {
    ArrayList<Integer> list;
    int idx = 0;
    public void dfs(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        dfs(root.left,list);
        list.add(root.val);
        dfs(root.right,list);


    }

    public m173(TreeNode root) {
        list = new ArrayList<>();
        dfs(root,list);
    }

    public int next() {

        return list.get(idx++);

    }

    public boolean hasNext() {
        return idx<list.size();
    }
}
