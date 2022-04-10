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
	public void depthFirst(String root)
	{
		int count = 0;
		Stack<String> stack = new Stack<>();
		stack.push(root);
		System.out.print(root+" ");
		while(!stack.isEmpty())
		{
			int index = verticent.get(root);
			for(int i = 0; i < vertecent; i++)
			{
				if(index == i)
				{
					for(String ele: edges[index])
					{
						System.out.print(ele+ " ");
						edges[index].remove(ele);
						stack.push(ele);
						index = verticent.get(ele);
						break;
					}
				}
			}
			stack.pop();
			if(!edges[0].isEmpty())
			{
				stack.push(root);
			}
		}                                     		
	}
}