package com.example.code.arrayss;

import java.util.*;

public class eLCP07 {


    public int dfs(HashMap<Integer,List<Integer>> map,int from,int k,int n){
        if(!map.containsKey(from) || k==0){
            return 0;
        }

        List<Integer> list = map.get(from);

        if(k == 1 && list.contains(n-1)){
            return 1;
        }

        int res = 0;
        for ( int x : list
             ) {
            res += dfs(map,x,k-1,n);
        }

        return res;


    }


    public int numWays(int n, int[][] relation, int k) {
        // 正向来，我们从这走去哪
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int len = relation.length;
        for (int i = 0; i < len; i++) {
            int[] relationship = relation[i];
            int from = relationship[0];
            int to = relationship[1];
            if(map.containsKey(from)){
                List<Integer> list = map.get(from);
                list.add(to);
                map.put(from,list);

            }else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(to);
                map.put(from,list);
            }
        }

        return dfs(map, 0, k, n);

    }



    public int numWaysDP(int n, int[][] relation, int k) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int len = relation.length;
        for (int i = 0; i < len; i++) {
            int[] relationship = relation[i];
            int from = relationship[0];
            int to = relationship[1];
            if(map.containsKey(from)){
                List<Integer> list = map.get(from);
                list.add(to);
                map.put(from,list);

            }else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(to);
                map.put(from,list);
            }
        }

        int[][] dp = new int[k+1][n+1];

        Set<Integer> froms = map.keySet();
        ArrayList<Integer> integers = new ArrayList<>(froms);
        Collections.sort(integers);

        for (int i = 0; i < k+1; i++) {
            for (int from: integers
            ) {
                List<Integer> list = map.get(from);
                for (int to: list
                ) {
                    dp[i+1][to] = dp[i][from] + 1;
                }

            }
        }


        return dp[k][n];

    }
}
