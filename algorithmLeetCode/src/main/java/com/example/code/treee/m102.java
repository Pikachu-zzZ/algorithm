package com.example.code.treee;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class m102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // 使用Queue：根节点入队，出队找邻接的节点
        // 新建list存储每一层节点
        ArrayList<List<Integer>> sumlist = new ArrayList<>();
        // 新建queue（没有）:用LinkedList
        LinkedList<TreeNode> queue = new LinkedList<>();
        //1、根节点入队
        queue.add(root);
        while(!queue.isEmpty()){
            // 新建list存储每一层节点
            ArrayList<Integer> list = new ArrayList<>();
            // 2、判断当前quequ长度
            int len = queue.size();
            for (int i = 0;i<len;i++){
                // 3、出队
                TreeNode node = queue.getFirst();
                list.add(node.val);
                //左叶子结点不为空入队
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            sumlist.add(list);
        }
        return sumlist;
    }
}
