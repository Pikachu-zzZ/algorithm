package com.example.code.class11;

import java.util.HashMap;
import java.util.HashSet;

public class Graph {
	// 序号和点实例
	public HashMap<Integer, Node> nodes;
	public HashSet<Edge> edges;
	
	public Graph() {
		nodes = new HashMap<>();
		edges = new HashSet<>();
	}
}
