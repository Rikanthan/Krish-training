import java.util.*;
public class Articulation
{
    private HashMap<String,Integer> lowerIndex;
    private HashMap<String,Integer> depthIndex;
    public HashMap<String,Integer> getDepth(List<String> dfs)
    {
        HashMap<String,Integer> depth = new HashMap<>();
        int index = 1;
        for(String s: dfs)
        {
            depth.put(s,index);
            index++;
        }
        depthIndex = depth;
        return depth;
    }
    public HashMap<String,Integer> getLowestIndex(
        String[] backEdges
    ,List<String> dfs, HashMap<String,Integer> depth, 
    HashMap<String,Integer> verticent )
    {   
        HashMap<String,Integer> lower = new HashMap<>();
        for(int i = 0 ; i < dfs.size(); i++)
        {
            if( depth.get((dfs.get(i))) == 1)
            {
               lower.put(dfs.get(i),1);
            }
            else{
                int j = verticent.get(dfs.get(i));
                for(int t = j; t < backEdges.length; t++)
                {
                    if(backEdges[t] != null)
                    {
                        if(depth.get(backEdges[t]) != 9)
                        {
                            lower.put(dfs.get(i), depth.get(backEdges[t]));
                            break;
                        }
                    }
                    
                }
            }
        }
        lowerIndex = lower;
        return lower;
    }
    public void findArticulationPoint(String parent, String child)
    {
        if(lowerIndex.get(child) >= depthIndex.get(parent))
        {
            System.out.println(parent+" is the articulation point");
        }
        else
        {
            System.out.println(
                "No articulation point found");
        }
    }
	public static void main(String args[])
    {
        Graph graph = new Graph(9);
        Articulation articulation = new Articulation();
        graph.addAdjecent(0,"A");
        graph.addAdjecent(1,"D");
        graph.addAdjecent(2,"C");
        graph.addAdjecent(3,"B");
        graph.addAdjecent(4,"E");
        graph.addAdjecent(5,"F");
        graph.addAdjecent(6,"G");
        graph.addAdjecent(7,"H");
        graph.addAdjecent(8,"I");

        graph.addEdges(0,"D");
        graph.addEdges(3,"C");
        graph.addEdges(0,"B");
        graph.addEdges(2,"E");
        graph.addEdges(4,"F");
        graph.addEdges(2,"F");
        graph.addEdges(1,"C");
        graph.addEdges(5,"G");
        graph.addEdges(6,"H");
        graph.addEdges(6,"I");
        graph.addEdges(7,"I");
        
        List<String> getDfs  = graph.depthFirst("A");
        String[] backEdges = graph.putBacktracking(getDfs);
        HashMap<String,Integer> verticent = graph.getVerticents();
        HashMap<String,Integer> depth = articulation.getDepth(getDfs);
        articulation.getLowestIndex(backEdges, getDfs,depth,verticent ); 
        articulation.findArticulationPoint("B","C");
        articulation.findArticulationPoint("C","E");
        articulation.findArticulationPoint("C","F");
        articulation.findArticulationPoint("F","G");
        articulation.findArticulationPoint("H","G");
        articulation.findArticulationPoint("H","I");
        articulation.findArticulationPoint("G","F"); 
    }
}