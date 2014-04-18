package me.agilani.www;

public class FamilyTree {
	
	private Node goalNode;
	private Node startFrom;
	
	public FamilyTree()
	{
		Node parentNode = new Node(1, "Shafiq", null);
		
		Node adeel = new Node(1, "Adeel", parentNode);
		Node nabeel = new Node(1, "Nabeel", parentNode);
		Node kiran = new Node(1, "Kiran", parentNode);
		
		Node kamil = new Node(2, "Kamil", adeel);
		Node child1 = new Node(2, "Fake 1", adeel);
		Node child2 = new Node(2, "Fake 2", adeel);

		Node zoya = new Node(2, "Zoya", nabeel);
		
		Node child3 = new Node(2, "Fake 3", nabeel);
		Node child4 = new Node(2, "Fake 4", nabeel);
		Node child5 = new Node(2, "Fake 5", nabeel);
		
		Node taha = new Node(2, "Taha", kiran);
		Node zoha = new Node(2, "Zoha", kiran);
		Node hudda = new Node(2, "Hudda", kiran);
		Node child6 = new Node(2, "Fake 6", kiran);
		
		Node child7 = new Node(3, "Fake 7", child6);
		Node child8 = new Node(3, "Fake 8", child6);
		
		
		
		
		parentNode.setChildren(adeel);
		parentNode.setChildren(nabeel);
		parentNode.setChildren(kiran);
		
		adeel.setChildren(kamil);
		adeel.setChildren(child1);
		adeel.setChildren(child2);
		
		nabeel.setChildren(zoya);
		nabeel.setChildren(child3);
		nabeel.setChildren(child4);
		nabeel.setChildren(child5);
		
		
		kiran.setChildren(taha);
		kiran.setChildren(zoha);
		kiran.setChildren(hudda);
		kiran.setChildren(child6);
		
		child6.setChildren(child7);
		child6.setChildren(child8);
		
		setStartFrom(parentNode);
		setGoalNode(child8);
	}

	/**
	 * @return the goalNode
	 */
	public Node getGoalNode() {
		return goalNode;
	}

	/**
	 * @param goalNode the goalNode to set
	 */
	public void setGoalNode(Node goalNode) {
		this.goalNode = goalNode;
	}

	/**
	 * @return the startFrom
	 */
	public Node getStartFrom() {
		return startFrom;
	}

	/**
	 * @param startFrom the startFrom to set
	 */
	public void setStartFrom(Node startFrom) {
		this.startFrom = startFrom;
	}

	

}
