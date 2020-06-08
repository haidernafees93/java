import java.util.Queue;
import java.util.LinkedList; 

public class bfs {
    class Node{
        int data;
        Node left;
        Node right;

        Node(int x){
            this.data = x;
            this.left = this.right = null;
        }
    }

    private Node root;
    private Node mover;

    public void push(int x){
        Node temp = new Node(x);
        if(root == null){
            root = temp;
            mover = root;
        }
        else if(mover.left == null){
            mover.left = temp;
        }
        else if(mover.left != null && mover.right == null){
            mover.right = temp;
        }
    }

    public void moveLeft(){
        mover = mover.left;
    }

    public void moveRight(){
        mover = mover.right;
    }

    public void moveReturn(){
        mover = root;
    }

    public void BreadFirstSearch(){
        Queue<Node> list = new LinkedList<>(); 
        list.add(root);

        while(!list.isEmpty()){
            Node h1 = list.remove();
            if(h1.left != null){
                list.add(h1.left);
            }
            if(h1.right != null)
            {
                list.add(h1.right);
            }
            System.out.print(h1.data +" ");
        }
    }
}