import java.util.*;

public class routeBetweenNodes {
    static int v = 6;
    static ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);

    private static void initialization(ArrayList<ArrayList<Integer>> adj){
        for(int i = 0; i < v; i++){
            adj.add(new ArrayList<Integer>());
        }
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
    }

    private static void check(ArrayList<ArrayList<Integer>> adj, int nodeA,int nodeB){
        boolean[] visited = new boolean[v];
        boolean check = false;
        Queue<Integer> list = new LinkedList<>();
        list.add(nodeA);
        while(!list.isEmpty()){
            if(visited[list.peek()] == true){
                list.poll();
            }
            else{
                //System.out.print(list.peek() + " ");
                if(list.peek() == nodeB){
                    check = true;
                    break;
                }
                visited[list.peek()] = true;
                for(int i = 0; i < adj.get(list.peek()).size(); i++){
                    list.add(adj.get(list.peek()).get(i));
                }
            }
        }
        if(check == true){
            System.out.println("The Path between two nodes exists");
        }
        else{
            System.out.println("The Path between two nodes does not exists");
        }
    }

    private static void print(ArrayList<ArrayList<Integer>> adj){
        for(int i = 0; i < adj.size(); i++){
            System.out.print(i);
            for(int j = 0; j < adj.get(i).size(); j++){
                System.out.print(" -> " + adj.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args){   

        initialization(adj);

        addEdge(adj, 0, 1); 
        addEdge(adj, 0, 2);  
        addEdge(adj, 2, 3); 
        addEdge(adj, 2, 4); 
        addEdge(adj, 5, 1);  

        print(adj);

        check(adj, 5, 2);
    }    
}