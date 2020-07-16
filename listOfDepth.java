import java.util.*;

public class listOfDepth {
    static int v = 8;
    static ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);

    public static void initialization(ArrayList<ArrayList<Integer>> adj){
        for(int i = 0; i < v; i++){
            adj.add(new ArrayList<Integer>());
        }
    }

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int V){
        adj.get(u).add(V);
    }

    public static void listDepth(ArrayList<ArrayList<Integer>> adj){
        int start = 4;
        int count = 1;
        int index = 0;
        boolean[] visited = new boolean[v];
        Queue<Integer> list = new LinkedList<>();
        Queue<Integer> list1 = new LinkedList<>();
        ArrayList<LinkedList<Integer>> result = new ArrayList<LinkedList<Integer>>(v);
        list.add(start);

        while(!list.isEmpty()){
            if(visited[list.peek()] == true){
                list.poll();
            }
            else{
                visited[list.peek()] = true;
                for(int i = 0; i < adj.get(list.peek()).size(); i++){
                    list.add(adj.get(list.peek()).get(i));
                }
                list1.add(list.poll());
                if(list1.size() == count){
                    result.add(new LinkedList<Integer>());
                    for(int i = 0; i < count; i++){
                        result.get(index).add(list1.poll());
                    }
                    count = 2*count;
                    index++;
                }
            }
        }
        
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
    }

    public static void main(String[] args){
        initialization(adj); 
        
        addEdge(adj, 4, 2); 
        addEdge(adj, 4, 6);  
        addEdge(adj, 2, 1); 
        addEdge(adj, 2, 3); 
        addEdge(adj, 6, 5);
        addEdge(adj, 6, 7);  

        listDepth(adj);
    }
}