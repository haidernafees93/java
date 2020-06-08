
public class intersection {
    class Node{
        int data;
        Node next;
        
        Node(int x){
            this.data = x;
            this.next = null;
        }
    }

    public Node head;

    public void add(int x){
        Node temp = new Node(x);
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
        while(h1.next!=null){
            System.out.print(h1.data + " -> ");
            h1=h1.next;
        }
        System.out.println(h1.data);
    }

    public void join(intersection a, intersection b){
        Node h1 = a.head;
        while(h1.next != null){
            h1 = h1.next;
        }
        h1.next = b.head;
    }

    public int length(intersection x){
        int length = 0;
        Node h1 = x.head;
        while(h1.next != null){
            length++;
            h1 = h1.next;
        }
        length++;
        return length;
    }

    public void find_inter(intersection a, intersection b){
        boolean result = false;
        Node h1 = a.head;
        Node h2 = b.head;

        int lengthA = a.length(a);
        int lengthB = b.length(b);

        int equalityCounter = 0;

        if(lengthA == lengthB){
            while(h1.next != null){
                if(h1 == h2){
                    result = true;
                    break;
                }
                else{
                    h1 = h1.next;
                    h2 = h2.next;
                }
            }
        }
        else{
            if(lengthA < lengthB){
                equalityCounter = lengthB - lengthA;
                for(int i = 0; i < equalityCounter; i++){
                    h2 = h2.next;
                }
                while(h1.next != null){
                    if(h1 == h2){
                        result = true;
                        break;
                    }
                    else{
                        h1 = h1.next;
                        h2 = h2.next;
                    }
                }
            }
            else{
                equalityCounter = lengthA - lengthB;
                for(int i = 0; i < equalityCounter; i++){
                    h1 = h1.next;
                }
                while(h1.next != null){
                    if(h1 == h2){
                        result =true;
                        break;
                    }
                    else{
                        h1 = h1.next;
                        h2 = h2.next;
                    }
                }
            }
        }
        if(result == true){
            System.out.println("The lists are intersecting");
        }
        else{
            System.out.println("The lists are not intersecting");
        }
    }
}