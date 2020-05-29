public class trees{
    class Node{
        int data;
        Node left,right;
    
        Node(int x){
            this.data = x;
            this.left = this.right = null;
        }
    }

    Node root;
    Node visitNode;

    public void root(int x){
        root = new Node(x);
        visitNode = root;
    }

    public void root(){
        root = null;
        visitNode = root;
    }

    public void addleft(int x){
        visitNode.left = new Node(x);
    }

    public void addright(int x){
        visitNode.right = new Node(x);
    }

    public void visitleft(){
        visitNode = visitNode.left ;
    }

    public void visitright(){
        visitNode = visitNode.right;
    }

}