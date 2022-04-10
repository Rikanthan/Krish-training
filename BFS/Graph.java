import java.util.*;
public class Graph{
	private int vertecent;
	private LinkedList<String> edges[];
	private HashMap<String,Integer> verticent;
	Graph(int v)
	{
		vertecent = v;
		edges = new LinkedList[vertecent];
		verticent = new HashMap<>();
		for(int i = 0; i < vertecent; i++)
		{
			edges[i] = new LinkedList<>();
		}
	}
	public void addEdges(int index,String parent)
	{
		edges[index].add(parent);
	}
	public void addAdjecent(int index,String parent)
	{
		try
		{
			verticent.put(parent,index);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void print()
	{
		for(int i = 0; i < vertecent; i++)
		{
			System.out.println(edges[i]);
		}

	}
	public void breathFirst(String root)
	{
		int count = 0;
		Queue<String> queue = new LinkedList<>();
		queue.add(root);
		List<String> bfs = new ArrayList<>();
		while(!queue.isEmpty())
		{
			String element = queue.remove();
			if(!bfs.contains(element))
			{
				bfs.add(element);
			}
			int index = verticent.get(element);
			for(String ele: edges[index])
			{
				queue.add(ele);
			}

		}                                     
		System.out.println(bfs);		
	}
}