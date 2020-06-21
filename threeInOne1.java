
public class threeInOne1 {
    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    private Node head;
    private int capacity = 5;
    private int count = 0;
    private int min = 1999999999;

    public void push(int x) {

        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        count++;

        if(temp.data < min){
            min = temp.data;
        }    
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        if(count == capacity){
            return true;
        }
        else{
            return false;
        }
    }

    public int pop() {
        int temp = head.data;
        head = head.next;
        return temp;
    }

    public void print() {
        Node h1 = head;
        while (h1.next != null) {
            System.out.print(h1.data + " -> ");
            h1 = h1.next;
        }
        System.out.println(h1.data);
    }

    public int min(){
        return min;
    }

    public void split(int[] arr) {
        threeInOne1 listA = new threeInOne1();
        threeInOne1 listB = new threeInOne1();
        threeInOne1 listC = new threeInOne1();

        int size = arr.length/3;
        int i = 0;

        if(arr.length < 3){
            System.out.println("The partition is not possible");
        }

        else{
            for (; i < size;i++) {
                listA.push(arr[i]);
                listB.push(arr[i+size]); 
            }
    
            i = i + size;
    
            for (; i < arr.length;i++) {
                listC.push(arr[i]); 
            }
    
            listA.print();
            listB.print();
            listC.print();
        }

    }

}