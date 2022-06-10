package com.example.code.treee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class m1305 {

    public List<Integer> list1;
    public List<Integer> list2;


    public void dfs(TreeNode root,List<Integer> list){
        if(root == null){
            return;
        }

        dfs(root.left,list);
        list.add(root.val);
        dfs(root.right,list);

    }


    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        list1 = new ArrayList<Integer>();
        list2 = new ArrayList<Integer>();
        ArrayList<Integer> res = new ArrayList<>();
        dfs(root1,list1);
        dfs(root2,list2);
        res.addAll(list1);
        res.addAll(list2);
        Collections.sort(res);
        return res;
    }
}
