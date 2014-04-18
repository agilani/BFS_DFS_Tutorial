package me.agilani.www;

public class Runner {

	public static void main(String[] args)
	{
		System.out.println("Simple Breadht first search");
		System.out.println("***************************");
		Search bfs = new BreadhtFirstSearch();
		bfs.search();

		System.out.println("\r\nCutoff Point Breadht first search");
		System.out.println("*********************************");

		Search bfs1 = new BreadhtFirstSearch();
		bfs1.cutoffPointSearch(2);
		
		
		System.out.println("\r\n");
		System.out.println("Simple Depth first search");
		System.out.println("*************************");
		Search dfs = new DepthFirstSearch();
		dfs.search();

		System.out.println("\r\nCutoff Point Depth first search");
		System.out.println("*******************************");
		
		Search dfs1 = new DepthFirstSearch();
		dfs1.cutoffPointSearch(3);
	}
}
