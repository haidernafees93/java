
public class stack {
    class Node{
        int data;
        Node next;

        Node(int x){
            this.data = x;
            this.next = null;
        }
    }

    private Node head;

    public void push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
    }

    public int pop(){
        int temp = head.data;
        head = head.next;
        return temp;
    }

    public int peek(){
        return head.data;
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        else{
            return false;
        }
    }

    public void print(){
        Node h1 = head;
        while(h1.next != null){
            System.out.print(h1.data + " -> ");
            h1=h1.next;
        }
        System.out.println(h1.data);
    }
}