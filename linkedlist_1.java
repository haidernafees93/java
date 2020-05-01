public class linkedlist_1{
    class Node{
        char data;
        Node next;

        Node(char x){
            this.data = x;
            this.next = null;
        }
    }

    private Node head;

    public void add(char x){
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

    public void rev_add(char x){
        Node temp = new Node(x);

        if(head == null){
            head = temp;
        }
        else{
            Node pre = head;
            head = temp;
            head.next = pre;
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

    public linkedlist_1 reverse(linkedlist_1 a){
        linkedlist_1 listA = new linkedlist_1();
        Node h1 = a.head;

        while(h1.next!= null){
            listA.rev_add(h1.data);
            h1 = h1.next;
        }
        listA.rev_add(h1.data);

        return listA;
    }

    public void palindrome(linkedlist_1 a){
        linkedlist_1 listB = reverse(a);
        boolean result = true;

        Node h1 = a.head;
        Node h2 = listB.head;

        while(h1.next != null){
            if(h1.data != h2.data){
                result = false;
                break;
            }
            h1 = h1.next;
            h2 = h2.next;
        }

        if(result == false){
            System.out.println("The linkedlist is not a palindrome");
        }
        else{
            System.out.println("The linkedlist is a palindrome");
        }
    }
}