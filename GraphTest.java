package com.om;

import java.util.ArrayList;

public class GraphTest {
	
	public static void main(String[] args) {
		
		Graph graph = new Graph(5);
		
		graph.addNode(new Node('A'));
		graph.addNode(new Node('B'));
		graph.addNode(new Node('C'));
		graph.addNode(new Node('D'));
		graph.addNode(new Node('E'));
		
		graph.addEdge(1, 3);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.addEdge(4, 1);
		
		graph.print();
		
		System.out.println(graph.checkEdge(1,4));
		
	}

}

class Graph{
	ArrayList<Node> nodes;
	int[][] matrix;
	
	Graph(int size){
		nodes = new ArrayList<>();
		matrix = new int[size][size];
	}
	public void print() {
		System.out.print("  ");
		for(Node node: nodes) { 
			System.out.print(node.data+" ");
		}
			System.out.println();
		
			for(int i=0; i<matrix.length; i++) {
				System.out.print(nodes.get(i).data+" ");
				for(int j=0; j<matrix[i].length; j++) {
					System.out.print(matrix[i][j] +" ");
				}
				System.out.println();
				
			}
		}
	
	
	public void addNode(Node node) {
		nodes.add(node);
	}
	
	public void addEdge(int source, int destination) {
		matrix[source][destination]=1;
	}
	public boolean checkEdge(int src, int dest) {
		if(matrix[src][dest]==1) {
			return true;
		}
		return false;
	}
	
}

class Node{
	char data;
    Node(char data){
    	this.data = data;
    }
}
