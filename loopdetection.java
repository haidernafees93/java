
public class loopdetection {
    class Node{
        char data;
        Node next;

        Node(char x){
            this.data = x;
            this.next = null;
        }
    }

    private Node head;

    public void add(char c){
        Node temp = new Node(c);
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

    public void loopMaker(loopdetection x){
        Node h1 = x.head;
        Node h2 = h1;

        while(h2.next != null){
            h2 = h2.next;
        }

        h1 = h1.next.next;
        h2.next = h1;
    }

    public void loopDetection(loopdetection x){
        Node h1 = x.head;
        Node h2 = h1.next;
        Node h3 = h2.next;

        while(h1.next != null){
            if(h1 == h2){
                break;
            }
            else if(h1 == h3){
                break;
            }
            else if(h1 == h3.next){
                break;
            }
            else if(h2 == h3){
                h1 = h1.next;
            }
            h2 = h2.next;
            h3 = h3.next.next;
        }

        System.out.println("The loop originator is: "+ h1.data);
    }
}