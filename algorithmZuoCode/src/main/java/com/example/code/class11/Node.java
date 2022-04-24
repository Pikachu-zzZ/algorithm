package com.example.code.class11;

import java.util.ArrayList;

// 点结构的描述
public class Node {
	// 值
	public int value;
	public int in; // 入度
	public int out; // 出度
	public ArrayList<Node> nexts; // 直接邻居，从该点出发
	public ArrayList<Edge> edges; // 边实例

	public Node(int value) {
		this.value = value;
		in = 0;
		out = 0;
		nexts = new ArrayList<>();
		edges = new ArrayList<>();
	}
}
