package me.agilani.www;

import java.util.ArrayList;
import java.util.List;

public class Node{

	private Node parent;
	private List<Node> children = new ArrayList<Node>();
	private String name;
	private int number;
	private boolean visited = false;
	
	public Node(int number, String name, Node parent)
	{
		setParent(parent);
		setNumber(number);
		setName(name);
	}
	
	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public List<Node> getChildren() {
		return children;
	}

	public void setChildren(Node child) {
		this.children.add(child);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the visited
	 */
	public boolean isVisited() {
		return visited;
	}

	/**
	 * @param visited the visited to set
	 */
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
}
