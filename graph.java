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

    static void addEdgedirect(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
    }

    static void bfsdirected(ArrayList<ArrayList<Integer>> adj){
        boolean visited[] = new boolean[adj.size()];
        Queue<Integer> list = new LinkedList<>();
        list.add(0);
        while(!list.isEmpty()){
            if(visited[list.peek()] == true){ 
                list.poll();
            }
            else{
                System.out.print(list.peek() + " ");
                visited[list.peek()] = true;
                for(int i = 0; i < adj.get(list.peek()).size(); i++){
                    list.add(adj.get(list.peek()).get(i));
                }
                list.poll();
            }
        }
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
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
        
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<Integer>());
        }

        addEdgedirect(adj, 0, 1); 
        addEdgedirect(adj, 0, 2);  
        addEdgedirect(adj, 2, 3); 
        addEdgedirect(adj, 2, 4); 
        addEdgedirect(adj, 5, 1);  

        // addEdge(adj, 0, 1); 
        // addEdge(adj, 0, 2);  
        // addEdge(adj, 2, 3); 
        // addEdge(adj, 2, 4); 
        // addEdge(adj, 5, 1);  

        bfsdirected(adj);
    }
} 