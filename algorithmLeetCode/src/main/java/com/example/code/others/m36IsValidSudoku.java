package com.example.code.others;

import java.util.HashMap;
import java.util.HashSet;

public class m36IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        // 记录某行，某位数字是否已经被摆放
        // 第一个9 代表行号，0-8，第二个9代表当前出现的元素（元素范围时1-9，用下标0-8表示）
        boolean[][] row = new boolean[9][9];
        // 记录某列，某位数字是否已经被摆放
        boolean[][] col = new boolean[9][9];
        // 记录某 3x3 宫格内，某位数字是否已经被摆放,
        // 第一个9 代表小九宫格的标号，0-8，第二个9代表当前出现的元素（元素范围时1-9，用下标0-8表示）
        boolean[][] block = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] != '.') {
                    // 因为 元素（1-9）和下标（0-8）之间的对应关系相差1，因此要减去1，不然9元素没有地方存放
                    int num = board[i][j] - '1';
                    // 通过单元格下标i，j 可以计算出 九宫格的下标 i/3，j/3，通过九宫格下标可以计算出九宫格编号（0-8），公式就是下面这个
                    int blockIndex = i / 3 * 3 + j / 3;
                    // 如果对应的行，列，九宫格中出现过这个num，就是重复了
                    if (row[i][num] || col[j][num] || block[blockIndex][num]) {
                        return false;
                    } else {
                        // 比如board数组第0行，第0列是个5，则将row[0][4] 置为 true,因为长度为9，下标是0-8，我们需要减1来代表该元素
                        row[i][num] = true;
                        // col[0][4] 置为 true,
                        col[j][num] = true;
                        // 计算后的小九宫格编号 对应的下标置为true
                        block[blockIndex][num] = true;
                    }
                }
            }
        }
        return true;
    }

    public boolean isValidSudoku_hash(char[][] board) {
        HashMap<Integer, HashSet<Integer>> row = new HashMap<>(9);
        HashMap<Integer, HashSet<Integer>> col = new HashMap<>(9);
        HashMap<Integer, HashSet<Integer>> block = new HashMap<>(9);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0';
                    int blockIndex = i / 3 * 3 + j / 3;

                    HashSet<Integer> rowSet = row.getOrDefault(i, new HashSet<Integer>());
                    HashSet<Integer> colSet = col.getOrDefault(j, new HashSet<Integer>());
                    HashSet<Integer> blockSet = block.getOrDefault(blockIndex,new HashSet<Integer>());

                    if(rowSet.contains(num) || colSet.contains(num) || blockSet.contains(num)){
                        return false;
                    }else {
                        rowSet.add(num);
                        row.put(i,rowSet);

                        colSet.add(num);
                        col.put(j,colSet);

                        blockSet.add(num);
                        block.put(blockIndex,blockSet);
                    }

                }
            }
        }
        return true;
    }
}
