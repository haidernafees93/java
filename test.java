public class test {
    class Node{
        int data;
        Node next;

        Node(int x){
            this.data = x;
            this.next = null;
        }
    }

    private Node head;

    public void add(int x){
        Node h = head;
        Node temp = new Node(x);
        
        if(head == null)
        {
            head = temp;
        }
        else{
            while(h.next != null){
                h = h.next;
            }
            h.next = temp;
        }
    }

    public void print(){
        Node h = head;
        while(h.next != null){
            System.out.print(h.data + " -> ");
            h = h.next;
        }
        System.out.println(h.data);
    }
}