import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
  
class graph { 
      
    // A utility function to add an edge in an 
    // undirected graph 
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void bfs(ArrayList<ArrayList<Integer>> adj){
        boolean visited[] = new boolean[adj.size()];
        for(int i = 0; i < adj.size(); i++){
            if(visited[i]==true){

            }
            else if(adj.get(i).size() == 0){

            }
            else{
                visited[i] = true;
                System.out.print(i + "  ");
                for(int j = 0; j < adj.get(i).size(); j++){
                    if(visited[adj.get(i).get(j)]==true){

                    }
                    else{
                        visited[adj.get(i).get(j)] = true;
                        System.out.print(adj.get(i).get(j) + "  ");
                    }
                }
            }
        }
        System.out.println();
    }

    static void print(ArrayList<ArrayList<Integer>> adj){
        for(int i = 0; i < adj.size(); i++){
            System.out.print(i);
            for(int j = 0; j < adj.get(i).size(); j++){
                System.out.print(" -> " + adj.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
        
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<Integer>());
        }

        addEdge(adj, 0, 1); 
        addEdge(adj, 0, 4); 
        // addEdge(adj, 1, 2); 
        addEdge(adj, 1, 3); 
        addEdge(adj, 1, 4); 
        addEdge(adj, 2, 3); 
        addEdge(adj, 3, 4); 

        bfs(adj);
    }
} 