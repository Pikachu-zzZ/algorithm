package com.example.code.arrayss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class m417 {


    int[] xMove = new int[]{1,-1,0,0};
    int[] yMove = new int[]{0,0,1,-1};


    public void dfs(int[][] heights,int x,int y, int[][] flag){

        flag[x][y] =1;

        for (int i = 0; i < 4; i++) {
            int newRow = x + xMove[i];
            int newCol = y + yMove[i];
            if(newRow >= 0 && newRow < heights.length && newCol>=0 && newCol< heights[0].length &&
                    heights[newRow][newCol] >=heights[x][y] && flag[newRow][newCol]!=1){
                dfs(heights,newRow,newCol,flag);
            }

        }


    }


    public List<List<Integer>> pacificAtlantic(int[][] heights) {



        int row = heights.length;
        int col = heights[0].length;
        int[][] pacific = new int[row][col];
        int[][] atlantic = new int[row][col];

        for (int i = 0; i < row; i++) {
            dfs(heights,i,0,pacific);
            dfs(heights,i,col-1,atlantic);

        }

        for (int i = 0; i < col; i++) {
            dfs(heights,0,i,pacific);
            dfs(heights,row-1,i,atlantic);

        }


        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(atlantic[i][j] ==1 && pacific[i][j] ==1){
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    list.add(i);
                    list.add(j);
                    result.add(list);
                }
            }
        }

        for (int[] x: atlantic
        ) {
            System.out.println(Arrays.toString(x));
        }
        for (int[] x: pacific
        ) {
            System.out.println(Arrays.toString(x));
        }


        return result;
    }


}
