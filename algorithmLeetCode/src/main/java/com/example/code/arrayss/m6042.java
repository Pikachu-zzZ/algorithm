package com.example.code.arrayss;

import java.util.HashSet;

class Point{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}



public class m6042 {
    public int countLatticePoints(int[][] circles) {
        int res = 0;

        HashSet<Point> set = new HashSet<>();

        int len = circles.length;
        for (int[] point: circles
             ) {
            int x = point[0];
            int y = point[1];
            int r = point[2];


        }



        return res;
    }
}
