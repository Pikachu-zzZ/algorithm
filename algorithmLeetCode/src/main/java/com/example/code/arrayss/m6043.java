package com.example.code.arrayss;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class m6043 {
    public int[] countRectangles(int[][] rectangles, int[][] points) {
        int length = points.length;
        int[] res = new int[length];
        ArrayList<Point> list = new ArrayList<>();
        int len = rectangles.length;
        for (int i = 0; i < len; i++) {
            list.add(new Point(rectangles[i][0],rectangles[i][1]));

        }


        list.sort(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if (o1.x != o2.x) {
                    return o1.x - o2.x;
                } else {
                    return o1.y - o2.y;
                }
            }
        });

        int idx = 0;
        for (int[] point: points
             ) {
            int count = 0;
            int x = point[0];
            int y = point[1];
            for (Point p: list
                 ) {
                if(x<=p.x && y <=p.y){
                    count++;
                }
            }

            res[idx++] = count;
        }

        return res;
    }
}
