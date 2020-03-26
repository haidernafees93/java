public class removeDups{
    class Node{
        int data;
        Node next;

        Node(int x){
            this.data = x;
            this.next = null;
        }
    }

    private Node head;

    public void add(int y){
        Node temp = new Node(y);
        if(head == null){
            head = temp;
        }
        else{
            Node h1 = head;
            while(h1.next != null){
                h1 = h1.next;
            }
            h1.next = temp;
        }
    }

    public void print(){
        Node h1 = head;
        while(h1.next != null){
            System.out.print(h1.data + " -> ");
            h1 = h1.next;
        }
        System.out.println(h1.data);
    }

    public void delete(Node pre){
        pre.next = pre.next.next;
    }

    public void comparison(){
        Node h1 = head;
        Node pre = h1;
        Node r = pre.next;

        while(h1.next != null){
            pre = h1;
            r = h1.next;
            while(r.next != null){
                if(h1.data == r.data){
                    pre.next = r.next;
                    r = pre.next;
                }
                else{
                    pre = r;
                    r = r.next;
                }
            }
            h1 = h1.next;
            if(h1.next == null){
                if(pre.data == h1.data){
                    pre.next = null;
                }
            }
        }
    }
}