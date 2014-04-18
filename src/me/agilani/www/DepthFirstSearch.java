package me.agilani.www;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DepthFirstSearch implements Search {

	private Node parentNode, goalNode;
	private Queue<Node> queue = new LinkedList<Node>();
	private boolean goalFound = false;
	
	public DepthFirstSearch()
	{
		FamilyTree tree = new FamilyTree();
		setParentNode(tree.getStartFrom());
		setGoalNode(tree.getGoalNode());
	}
	
	@Override
	public void search()
	{
		doSearch(0);
		if(goalFound)
			System.out.println("Goal Node Found");
		else
			System.out.println("Goal Node Not Found");
	}
	
	@Override
	public void cutoffPointSearch(int threshold)
	{
		doSearch(threshold);
		if(goalFound)
			System.out.println("Goal Node Found");
		else
			System.out.println("Goal Node Not Found");
	}
	
	private void doSearch(int threshold)
	{
		
		if(threshold>0)
				System.out.println("Threshold " + threshold);
		
		System.out.println("Looking for " + getGoalNode().getName());
		
		queue.add(getParentNode());
		
		while(goalFound==false)
		{
			if(queue.size()<=0)
				return;
			
			Node first = queue.poll();
			first.setVisited(true);
			
			System.out.print("Visiting: " + first.getName());
			if(first.getParent()!=null)
			{
				System.out.print(" who's parent is " + first.getParent().getName());
				
				if(first.getParent().getChildren().size()>1)
				{
					System.out.print(" and Siblings are ");
					
					for(Node sibling : first.getParent().getChildren())
					{
						if(!first.equals(sibling))
							System.out.print(sibling.getName() + " ");
					}
				}
			}
			else
				System.out.print(" who is father of all ");
			
			System.out.println();

			if(first.equals(getGoalNode()))
			{
				goalFound = true;
				break;
			}
			else
			{
				this.addFirst(first.getChildren(), threshold);
			}
		}		
	}

	private Node getParentNode() {
		return parentNode;
	}

	private void setParentNode(Node parentNode) {
		this.parentNode = parentNode;
	}

	private Node getGoalNode() {
		return goalNode;
	}

	private void setGoalNode(Node goalNode) {
		this.goalNode = goalNode;
	}
	
	private void addFirst(List<Node> children, int threshold)
	{
		Queue<Node> tempQueue = new LinkedList<Node>();
		
		if(threshold<=0)
		{
			for(int i = 0; i<=children.size()-1; i++)
			{
				tempQueue.add(children.get(i));
			}
		}
		else
		{
			if(children.size()>=threshold)
			{
				for(int i = 0; i<threshold; i++)
				{
					if(children.get(i)==null)
					{
						break;
					}
					else
					{
						tempQueue.add(children.get(i));	
					}
				}
			}
			else
			{
				for(int i = 0; i<children.size(); i++)
				{
					if(children.get(i)==null)
					{
						break;
					}
					else
					{
						tempQueue.add(children.get(i));	
						//System.out.println("---- " + children.get(i).getName() );
					}
				}
			}
		}
		
		for(Node item : queue)
		{
			tempQueue.add(item);
			//System.out.println(" ----- " + item.getName());
		}
		
		queue = tempQueue;
	}
}
