package com.example.code.arrayss;


import java.util.ArrayList;

class Orange{
    int x;
    int y;
    public Orange(int x,int y){
        this.x = x;
        this.y = y;
    }
}

public class m994 {
    public int orangesRotting(int[][] grid) {
        int[] xDirection = {1,-1,0,0};
        int[] yDirection = {0,0,1,-1};
        int row = grid.length;
        int col = grid[0].length;
        ArrayList<Orange> list = new ArrayList<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(grid[i][j] == 2){   //每个2都是根节点，层序遍历（广度优先）衍生出一棵树
                    list.add(new Orange(i,j));
                }
            }
        }
        int count = 0;
        while(!list.isEmpty()){

            int len = list.size();
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < 4; j++) {
                    int newX = list.get(i).x+xDirection[j];
                    int newY = list.get(i).y+yDirection[j];
                    if(newX>=0 && newX<row && newY >=0 && newY <col && grid[newX][newY] ==1){
                        grid[newX][newY] = 2;
                        list.add(new Orange(newX,newY));
                    }
                }
            }
            if(list.size() != len){
                count++;
            }
            for (int i = 0; i < len; i++) {
                list.remove(0);
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(grid[i][j] ==1){
                    return -1;
                }
            }
        }


        return count;
    }
}
