package com.example.code.class11;



import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Code07_MergeUsers {
    public static class User{
        public String a;
        public String b;
        public String c;
        public User(String a, String b, String c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

    }


    public static class Node<V> {
        V value;

        public Node(V v) {
            value = v;
        }
    }

    public static class UnionFind<V> {
        public HashMap<V, Node<V>> nodes;
        public HashMap<Node<V>, Node<V>> parents;
        public HashMap<Node<V>, Integer> sizeMap;

        public UnionFind(List<V> values) {
            nodes = new HashMap<>();
            parents = new HashMap<>();
            sizeMap = new HashMap<>();
            for (V cur : values) {
                Node<V> node = new Node<>(cur);
                nodes.put(cur, node);
                parents.put(node, node);
                sizeMap.put(node, 1);
            }
        }

        // 给你一个节点，请你往上到不能再往上，把代表返回
        // 同时优化，所有的子节点直接指向父节点
        public Node<V> findFather(Node<V> cur) {
            Stack<Node<V>> path = new Stack<>();

            while (cur != parents.get(cur)) {
                path.push(cur);
                cur = parents.get(cur);
            }
            while (!path.isEmpty()) {
                parents.put(path.pop(), cur);
            }
            return cur;
        }

        public boolean isSameSet(V a, V b) {
            return findFather(nodes.get(a)) == findFather(nodes.get(b));
        }

        public void union(V a, V b) {
            Node<V> aHead = findFather(nodes.get(a));
            Node<V> bHead = findFather(nodes.get(b));
            if (aHead != bHead) {
                int aSetSize = sizeMap.get(aHead);
                int bSetSize = sizeMap.get(bHead);
                Node<V> big = aSetSize >= bSetSize ? aHead : bHead;
                Node<V> small = big == aHead ? bHead : aHead;
                parents.put(small, big);
                sizeMap.put(big, aSetSize + bSetSize);
                sizeMap.remove(small);
            }
        }

        public int sets() {
            return sizeMap.size();
        }


        public int getSetsNum(){
            return sizeMap.size();
        }


    }



    //如果两个user，a字段一样、或者b字段一样、或者c字段一样，就认为是一个人.
    //请合并users，返回合并之后的用户数量
    public static int mergeUsers(List<User> users) {

        // 为每一个用户新建节点
        UnionFind<User> userUnionFind = new UnionFind<User>(users);

        HashMap<String, User> mapA = new HashMap<>();
        HashMap<String, User> mapB = new HashMap<>();
        HashMap<String, User> mapC  = new HashMap<>();


        for (User user: users
             ) {
            if(mapA.containsKey(user.a)){
                userUnionFind.union(mapA.get(user.a),user);
            }else {
                mapA.put(user.a,user);
            }

            if(mapB.containsKey(user.b)){
                userUnionFind.union(mapB.get(user.b),user);
            }else {
                mapB.put(user.b,user);
            }

            if(mapC.containsKey(user.c)){
                userUnionFind.union(mapC.get(user.c),user);
            }else {
                mapC.put(user.c,user);
            }


            // 查询还有多少集合


        }


        return userUnionFind.getSetsNum();
    }


}
