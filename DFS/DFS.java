public class DFS
{
	public static void main(String args[])
    {
        Graph graph = new Graph(7);
        graph.addAdjecent(0,"A");
        graph.addAdjecent(1,"B");
        graph.addAdjecent(2,"C");
        graph.addAdjecent(3,"D");
        graph.addAdjecent(4,"E");
        graph.addAdjecent(5,"F");
        graph.addAdjecent(6,"G");

        graph.addEdges(0,"C");
        graph.addEdges(2,"E");
        graph.addEdges(2,"G");
        graph.addEdges(0,"B");
        graph.addEdges(1,"D");
        graph.addEdges(4,"F");
        graph.addEdges(5,"G");
        
        graph.depthFirst("A");
    }
}