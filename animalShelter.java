public class animalShelter{
    class Node{
        char data;
        Node next;

        Node(char x){
            this.data = x;
            this.next = null;
        }
    }

    private Node head;
    private Node last;

    public void push(char x){
        Node temp = new Node(x);
        if(head == null){
            head = temp;
            last = head;
        }
        else{
            last.next = temp;
            last = last.next;
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

    public char peek(){
        return head.data;
    }

    public char pop(){
        char temp = head.data;
        head = head.next;
        return temp;
    }    

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }
    
    public void dequeueAny(){
        System.out.println("Your choice of the day is: "+ pop());
    }

    public void dequeueCat(){
        animalShelter tempQueue = new animalShelter(); 
        if(head == null){
            System.out.println("There are no cats and dogs, please try later");
        }
        else if(peek() == 'c'){
            System.out.println("Your cat of the day is: "+ pop());
        }
        else{
            while(!isEmpty() && peek() != 'c'){
                tempQueue.push(pop());
            }
            System.out.println("Here is your cat: " + pop());
            tempQueue.last.next = head;
            head = tempQueue.head;
        }
    }

    public void dequeueDog(){
        animalShelter tempQueue = new animalShelter(); 
        if(head == null){
            System.out.println("There are no cats and dogs, please try later");
        }
        else if(peek() == 'd'){
            System.out.println("Your dog of the day is: "+ pop());
        }
        else{
            while(!isEmpty() && peek() != 'd'){
                System.out.println("Peek = " + peek());
                tempQueue.push(pop());
            }
            System.out.println("Here is your dog: " + pop());
            tempQueue.last.next = head;
            head = tempQueue.head;
        }
    }
}